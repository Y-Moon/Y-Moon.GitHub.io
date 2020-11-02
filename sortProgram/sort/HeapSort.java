package sort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HeapSort {
    public static void main(String[] args) {
        int[] arrays={1,2,1,9,3,6,3,10,2,1,67,12,12,32};
        heapSort(arrays);
        for (int i : arrays) {
            System.out.print(i + "  ");
        }
    }

    private static void heapSort(int[] arrays) {
        builderHeap(arrays);
    }

    private static void builderHeap(int[] arrays) {
        List<Integer> list=new ArrayList<>();
    }
}
