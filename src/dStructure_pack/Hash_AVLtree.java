package dStructure_pack;

import java.util.ArrayList;

public class Hash_AVLtree<T> {
    // Nó da Árvore AVL
    private class Node {
        T data;
        Node left;
        Node right;
        int b_factor;
        int height;

        public Node(T data) {
            this.data = data;
            this.left = this.right = null;
            this.b_factor = this.height =  0;
        }
    }

    // Map Hash das raizes da Árvore AVL
    private ArrayList<ArrayList<Node>> map;
    private int count; // total de elementos

    public Hash_AVLtree(int size) {
        this.count = 0;
        this.map = new ArrayList<>(size);

        for (int i = 0; i < size; i++){
            map.set(i, new ArrayList<>(size));
            for (int j = 0; j < size; j++)
                map.get(i).set(j, null);
        }
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

    private Node insertion(T data, Node n) {
        if (n == null){
            count++;
            return new Node(data);
        }

        int i = n.data.toString().compareToIgnoreCase(data.toString());
        if (i > 0)
            n.left = insertion(data, n.left);
        else if (i < 0)
            n.right = insertion(data, n.right);
        else
            return n;
        
        updateNode(n);

        return rotation(n);
    }

    private Node search(String data, Node n) {
        if (n == null)
            return null;

        int i = n.data.toString().compareToIgnoreCase(data);
        if (i > 0)
            return search(data, n.left);
        if (i < 0)
            return search(data, n.right);
        
        return n;
    }

    private int h1(String data) {
        return (data.hashCode() & 0x7fffffff) % map.size();
    }

    private int h2(String data) {
        return 1 + (data.hashCode() & 0x7fffffff) % (map.size() - 1);
    }

    private int h1(T data) {
        return (data.hashCode() & 0x7fffffff) % map.size();
    }

    private int h2(T data) {
        return 1 + (data.hashCode() & 0x7fffffff) % (map.size() - 1);
    }

    public T getData(String data) {
        int h1 = h1(data);
        int h2 = h2(data);
        int h = (h1 + h2) % map.size();
        Node n = map.get(h1).get(h);

        return search(data, n).data;
    }

    public void addData(T data) {
        int h1 = h1(data);
        int h2 = h2(data);
        int h = (h1 + h2) % map.size();
        Node n = map.get(h1).get(h);

        insertion(data, n);
    }
}
