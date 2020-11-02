package sort;

public class CountingSort {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 1, 9, 3, 6, 3, 10, 2, 1, 67, 12, 12, 32};
        countSort(arrays);
        for (int array : arrays) {
            System.out.print(array + "  ");
        }
    }

    private static void countSort(int[] arrays) {
        int max = arrays[0], min = arrays[0];
        for (int array : arrays) {
            if (array < min)
                min = array;
            else if (array > max)
                max = array;
        }
        int[] count = new int[max - min + 1];
        for (int array : arrays) {
            ++count[array - min];
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                for (int i1 = 0; i1 < count[i]; i1++) {
                    arrays[index] = i + min;
                    ++index;
                }
            }
        }
    }
}
