package sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers={1,2,1,9,3,6,3,10,2,1,67,12,12,32};
        selectionSort(numbers);
        for (int i:numbers){
            System.out.print("\t" + i);
        }
    }
    public static void  selectionSort(int [] numbers){
        int median;
        int swap;
        for(int i=0;i<numbers.length-1;i++){
            median=i;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[median]>numbers[j]){
                    median=j;
                }
            }
            swap=numbers[median];
            numbers[median]=numbers[i];
            numbers[i]=swap;
        }
    }
}
