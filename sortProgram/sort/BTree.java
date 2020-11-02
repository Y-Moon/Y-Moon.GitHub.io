package sort;

public class BTree {
    static int index;
    private static class BTNode {
        char data;
        BTNode lchild;
        BTNode rchild;
    }

    public static void main(String[] args) {

        BTNode head, p, node;
        int arrays[] = new int[5];
        int i;
        p = new BTNode();
        head = p;
        p.data = 6;
        node = new BTNode();
        node.data = 4;
        p.lchild = node;
        node = new BTNode();
        node.data = 8;
        p.rchild = node;
        p = p.lchild;
        node = new BTNode();
        node.data = 2;
        p.lchild = node;
        node = new BTNode();
        node.data = 5;
        p.rchild = node;
        node = null;
        BTreeSort(head, arrays);
        for (int array : arrays) {
            System.out.printf("%d  ", array);
        }

    }
    static void BTreeSort(BTNode p, int arrays[]) {
        int i;
        if (p != null) {
            BTreeSort(p.lchild, arrays);
            arrays[index] = p.data;
            index++;
            BTreeSort(p.rchild, arrays);
        } else {
            return;
        }
    }
}

