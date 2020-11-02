package sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers={1,2,1,9,3,6,3,10,2,1,67,12,12,32};
        bubbleSort(numbers);
        for (int i:numbers){
            System.out.print("\t" + i);
        }
    }
    public static void  bubbleSort(int [] numbers){
        for(int i=0;i<numbers.length-1;i++){
            for(int j=0;j<numbers.length-i-1;j++){
                if(numbers[j]>numbers[j+1]){
                    int swap=numbers[j+1];
                    numbers[j+1]=numbers[j];
                    numbers[j]=swap;
                }
            }
        }
    }
}
