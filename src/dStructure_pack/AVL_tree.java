package dStructure_pack;

public class AVL_tree<T> {
    private class node {
        T data;
        node left;
        node right;
        int b_factor;
        int height;

        public node(T data) {
            this.data = data;
            this.left = this.right = null;
            this.b_factor = this.height =  0;
        }
    }

    private node root;
    protected int count;

    public AVL_tree() {
        this.root = null;
        this.count = 0;
    }

    private void updateNode(node n) {
        int l_height = (n.left == null) ? 0 : n.left.height + 1;
        int r_height = (n.right == null) ? 0 : n.right.height + 1;

        n.b_factor = l_height - r_height;
        n.height = (l_height >= r_height) ? l_height : r_height;
    }

    private node leftRotate(node n) {
        node c = n.right;
        node cc = c.left;
        c.left = n;
        n.right = cc;

        updateNode(n);
        updateNode(c);

        return c;
    }

    private node rightRotate(node n) {
        node c = n.left;
        node cc = c.right;
        c.right = n;
        n.left = cc;

        updateNode(n);
        updateNode(c);
        count++;

        return c;
    }
    
    private node rotation(node n) {
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

    private node insertion(T data, node n) {
        if (n == null)
            return new node(data);

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

    private node search(String data, node n) {
        if (n == null)
            return null;

        int i = n.data.toString().compareToIgnoreCase(data);
        if (i > 0)
            return search(data, n.left);
        if (i < 0)
            return search(data, n.right);
        
        return n;
    }

    public T getData(String data) {
        return search(data, root).data;
    }

    public void addData(T data) {
        this.root = insertion(data, root);
    }
}
