package biblioteca.models.dStructurePack;

public class AVLtree<T> {
    private class Node {
        private T data;
        private Node left;
        private Node right;
        private int b_factor;
        private int height;

        public Node(T data) {
            this.data = data;
            this.left = this.right = null;
            this.b_factor = this.height =  0;
        }
    }

    private Node root;
    private int count;

    public AVLtree() {
        this.root = null;
        this.count = 0;
    }

    private void updateNode(Node n) {
        int l_height = (n.left == null) ? 0 : n.left.height + 1;
        int r_height = (n.right == null) ? 0 : n.right.height + 1;

        n.b_factor = l_height - r_height;
        n.height = (l_height >= r_height) ? l_height : r_height;
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

    private int compareTo() {
        return 0;
    }

    private Node inserir(T data, Node n) {
        if (n == null)
            return new Node(data);

        int i = compareTo();
        if (i < 0)
            n.left = inserir(data, n.left);
        else if (i > 0)
            n.right = inserir(data, n.right);
        else
            return n;
        
        updateNode(n);
        count++;
        return rotation(n);
    }

    private Node buscar(String data, Node n) {
        if (n == null)
            return null;

        int i = compareTo();
        if (i < 0)
            return buscar(data, n.left);
        if (i > 0)
            return buscar(data, n.right);
        
        return n;
    }

    private Node sucessor(String data, Node n) {
        // TODO achar sucessor
        return null;
    }

    private Node remover(String data, Node n) {
        if (n == null)
            return null;
        
        int i = compareTo();
        if (i < 0)
            n.left = remover(data, n.left);
        else if (i > 0)
            n.right = remover(data, n.right);
        
        else {
            count--;
            if (n.right == n.left)
                return null;
            
            if (n.right == null)
                return n.left;
            if (n.left == null)
                return n.right;
    
            Node suc = sucessor(data, n);
            n.data = suc.data;
            // TODO remover sucessor
        }

        updateNode(n);
        return rotation(n);
    }


}
