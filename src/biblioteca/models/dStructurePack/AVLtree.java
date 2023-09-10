package biblioteca.models.dStructurePack;
import biblioteca.models.membrosPack.Membro;

public class AVLtree<K,V> {
    private class Node {
        private K chave;
        private V valor;
        private Node left;
        private Node right;
        private int b_factor;
        private int altura;

        public Node(K chave, V valor) {
            this.chave = chave;
            this.valor = valor;
            this.left = this.right = null;
            this.b_factor = this.altura =  0;
        }
    }

    private Node raiz;
    private int qtd;

    public AVLtree() {
        this.raiz = null;
        this.qtd = 0;
    }

    private void updateNode(Node n) {
        int l_height = (n.left == null) ? 0 : n.left.altura + 1;
        int r_height = (n.right == null) ? 0 : n.right.altura + 1;

        n.b_factor = l_height - r_height;
        n.altura = (l_height >= r_height) ? l_height : r_height;
    }

    private Node leftRotate(Node n) {
        Node c = n.right;
        Node cc = c.left;
        c.left = n;
        n.right = cc;

        updateNode(n);
        updateNode(c);

        return c;
    }

    private Node rightRotate(Node n) {
        Node c = n.left;
        Node cc = c.right;
        c.right = n;
        n.left = cc;

        updateNode(n);
        updateNode(c);

        return c;
    }
    
    private Node rotation(Node n) {
        if (n.b_factor == -2){
            if (n.right.b_factor == 1)
                n.right = rightRotate(n.right);
            
            return leftRotate(n);
        }

        if (n.b_factor == 2){
            if (n.left.b_factor == -1)
                n.left = leftRotate(n.left);
            
            return rightRotate(n);
        }

        return n;
    }

    private int compareTo(K chave1, K chave2) {
        if (chave1 instanceof String)
            return ((String)chave1).compareToIgnoreCase((String)chave2);

        return 0;
    }

    private Node inserir(K chave, V valor, Node n) {
        if (n == null){
            qtd++;
            return new Node(chave, valor);
        }

        int i = compareTo(n.chave, chave);
        if (i < 0)
            n.left = inserir(chave, valor, n.left);
        else if (i > 0)
            n.right = inserir(chave, valor, n.right);
        else
            return n;
        
        updateNode(n);
        return rotation(n);
    }

    private Node buscar(K chave, Node n) {
        if (n == null)
            return null;

        int i = compareTo(n.chave, chave);
        if (i < 0)
            return buscar(chave, n.left);
        if (i > 0)
            return buscar(chave, n.right);
        
        return n;
    }

    private Node sucessor(K chave, Node n) {
        if (n == null) 
            return null;
        
        if (compareTo(n.chave, chave) >= 0)
            return sucessor(chave, n.right);
        
        Node temp = sucessor(chave, n.left);
        return compareTo(n.chave, temp.chave) > 0 ? temp : n;
    }

    private Node remover(K chave, Node n) {
        if (n == null)
            return null;
        
        int i = compareTo(n.chave, chave);
        if (i < 0)
            n.left = remover(chave, n.left);
        else if (i > 0)
            n.right = remover(chave, n.right);
        
        else {
            
            if (n.right == n.left){
                qtd--;
                return null;
            }
            if (n.right == null){
                qtd--;
                return n.left;
            }
            if (n.left == null){
                qtd--;
                return n.right;
            }
    
            Node suc = sucessor(chave, n);
            n.valor = suc.valor;
            n.chave = suc.chave;
            n.right = remover(suc.chave, n.right);
        }

        updateNode(n);
        return rotation(n);
    }

    public void inserir(K chave, V valor) {
        raiz = inserir(chave, valor, raiz);
    }

    public V buscarChave(K chave) {
        return buscar(chave, raiz).valor;
    }

    public void remover(K chave) {
        raiz = remover(chave, raiz);
    }
}
