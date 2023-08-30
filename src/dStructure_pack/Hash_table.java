package dStructure_pack;

public class Hash_table<T> {
    private AVL_tree<T>[] table;
    

    public Hash_table(int size) {
        this.table = new AVL_tree[size];

        for (int i = 0; i < size; i++)
            table[i] = new AVL_tree<>();
    }

    private int getIndex(String data) {
        return Math.abs(data.hashCode()) % table.length;
    }

    public T getData(String data) {
        int index = getIndex(data);

        return table[index].getData(data);
    }

    public void addData(T data) {
        int index = getIndex(data.toString());
        table[index].addData(data);

    }
}
