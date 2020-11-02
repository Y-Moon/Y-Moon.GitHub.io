package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arrays={1,2,1,9,3,6,3,10,2,1,67,12,12,32};
        quickSort(arrays, 0, arrays.length - 1);
        for (int i : arrays) {
            System.out.print(i + "  ");
        }
    }
    private static void swap(int[] arrays,int a,int b){
        int temp=arrays[a];
        arrays[a]=arrays[b];
        arrays[b]=temp;
    }
    private static void quickSort(int[] arrays, int left, int right) {
        int index=left;
        if(left<right){
            for (int i = left+1; i < right + 1; i++) {
                if(arrays[left]>arrays[i]){
                    ++index;
                    if(index<=i){
                        swap(arrays,index,i);
                    }
                }
            }
            swap(arrays,index,left);
            quickSort(arrays,left,index-1);
            quickSort(arrays,index+1,right);
        }
    }

}
