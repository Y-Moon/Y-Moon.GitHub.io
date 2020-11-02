package sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers={8, 1, 2, 5, 3, 4, 9, 6 };
        insertionSort(numbers);
        for (int i:numbers){
            System.out.print("\t" + i);
        }
    }
    public static void  insertionSort(int [] numbers){
        int median,medianindex;
        for(int i=1;i<numbers.length;i++){
            medianindex=i;
            median=numbers[i];
           for(int j=i-1;j>=0;j--){
                if(median<numbers[j]){
                    numbers[j+1]=numbers[j];
                    medianindex=j;
                }else {
                    medianindex=j+1;
                    break;
                }

           }
           numbers[medianindex]=median;
        }
    }
}
