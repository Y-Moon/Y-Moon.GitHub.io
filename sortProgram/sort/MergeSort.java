package sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arrays={8, 1, 2, 5, 3, 4, 9, 6 };
//        int[] a=new int[3];
//        System.arraycopy(arrays,0,a,0,3);
//        for (int i : a) {
//            System.out.println("i = " + i);
//        }
        int[] arraysSort = mergeSort(arrays, 0, arrays.length - 1);
        for (int i : arraysSort) {
            System.out.print(i + "  ");
        }
    }

    public static int[] mergeSort(int[] arrays, int start, int end) {
        int length = end - start + 1;
        int[] arraysCopy = new int[length];
        if (length > 2) {
            int[] a = mergeSort(arrays, start, start+length / 2 - 1);
            int[] b = mergeSort(arrays, start+length / 2, end);
            for (int i = 0, ai = 0, bi = 0; i < length; i++) {
                if (ai >= a.length && bi<b.length) {
                    System.arraycopy(b, bi, arraysCopy, i, length - i);
                    break;
                } else if (bi >=b.length && ai <a.length) {
                    System.arraycopy(a, ai, arraysCopy, i, length - i);
                    break;
                }else if (ai <a.length) {
                    if (a[ai] <= b[bi]) {
                        arraysCopy[i] = a[ai];
                        ai++;
                    } else {
                        arraysCopy[i] = b[bi];
                        bi++;
                    }
                }
            }
        } else if (length == 2) {
            arraysCopy[0] = Math.min(arrays[start], arrays[end]);
            arraysCopy[1] = Math.max(arrays[start], arrays[end]);
        }
        if (length == 1) {
            arraysCopy[0] = arrays[start];
        }
        return arraysCopy;
    }
}
