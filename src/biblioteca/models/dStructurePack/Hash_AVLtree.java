package biblioteca.models.dStructurePack;
import java.util.ArrayList;

public class Hash_AVLtree<K,V> {
    private class Node {
        private K chave;
        private V valor;
        private Node dir;
        private Node esq;
        private int fatorb;
        private int altura;

        public Node(K chave, V valor) {
            this.chave = chave;
            this.valor = valor;
            this.dir = this.esq = null;
            this.fatorb = this.altura =  0;
        }
    }

    private ArrayList<Node> raizes;
    private int qtd;

    public Hash_AVLtree() {
        this.qtd = 0;
        this.raizes = new ArrayList<>(13);

        for (int i = 0; i < 13; i++) 
            raizes.set(i, null);
    }

    private void atualizarNo(Node n) {
        int altD = (n.dir == null) ? 0 : n.dir.altura + 1;
        int altE = (n.esq == null) ? 0 : n.esq.altura + 1;

        n.fatorb = altD - altE;
        n.altura = (altD >= altE) ? altD : altE;
    }

    private Node rotEsq(Node n) {
        Node f = n.esq;
        Node ff = f.dir;
        f.dir = n;
        n.esq = ff;

        atualizarNo(n);
        atualizarNo(f);

        return f;
    }

    private Node rotDir(Node n) {
        Node f = n.dir;
        Node ff = f.esq;
        f.esq = n;
        n.dir = ff;

        atualizarNo(n);
        atualizarNo(f);

        return f;
    }
    
    private Node rot(Node n) {
        if (n.fatorb == -2){
            if (n.esq.fatorb == 1)
                n.esq = rotDir(n.esq);
            
            return rotEsq(n);
        }

        if (n.fatorb == 2){
            if (n.dir.fatorb == -1)
                n.dir = rotEsq(n.dir);
            
            return rotDir(n);
        }

        return n;
    }

    private int compChave(K chave1, K chave2) {
        if (chave1 instanceof String)
            return ((String)chave1).compareToIgnoreCase((String)chave2);

        return 0;
    }

    private Node inserir(K chave, V valor, Node n) {
        if (n == null){
            qtd++;
            return new Node(chave, valor);
        }

        int i = compChave(n.chave, chave);
        if (i < 0)
            n.dir = inserir(chave, valor, n.dir);
        else if (i > 0)
            n.esq = inserir(chave, valor, n.esq);
        else
            return n;
        
        atualizarNo(n);
        return rot(n);
    }

    private Node buscar(K chave, Node n) {
        if (n == null)
            return null;

        int i = compChave(n.chave, chave);
        if (i < 0)
            return buscar(chave, n.dir);
        if (i > 0)
            return buscar(chave, n.esq);
        
        return n;
    }

    private Node sucessor(K chave, Node n) {
        if (n == null) 
            return null;
        
        if (compChave(n.chave, chave) >= 0)
            return sucessor(chave, n.esq);
        
        Node temp = sucessor(chave, n.dir);
        return compChave(n.chave, temp.chave) > 0 ? temp : n;
    }

    private Node remover(K chave, Node n) {
        if (n == null)
            return null;
        
        int i = compChave(n.chave, chave);
        if (i < 0)
            n.dir = remover(chave, n.dir);
        else if (i > 0)
            n.esq = remover(chave, n.esq);
        
        else {
            if (n.esq == n.dir){
                qtd--;
                return null;
            }
            if (n.esq == null){
                qtd--;
                return n.dir;
            }
            if (n.dir == null){
                qtd--;
                return n.esq;
            }
    
            Node suc = sucessor(chave, n);
            n.valor = suc.valor;
            n.chave = suc.chave;
            n.esq = remover(suc.chave, n.esq);
        }

        atualizarNo(n);
        return rot(n);
    }

    private int hash(K chave){
        if (chave instanceof String)
            return (chave.hashCode() & 0x7fffffff) % 13;

        else if (chave instanceof Integer)
            return (chave.hashCode() & 0x7fffffff) % 13;
        
        return 0;
    }
    
    public void inserir(K chave, V valor) {
        int h = hash(chave);
        raizes.set(h, inserir(chave, valor, raizes.get(h)));
    }

    public V buscarChave(K chave) {
        int h = hash(chave);
        return buscar(chave, raizes.get(h)).valor;
    }

    public void remover(K chave) {
        int h = hash(chave);
        raizes.set(h, remover(chave, raizes.get(h)));
    }
}
