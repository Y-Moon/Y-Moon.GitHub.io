package sort;

public class ShellSort {
    public static void main(String[] args) {
        int[] numbers={1,2,1,9,3,6,3,10,2,1,67,12,12,32};
        shellSort(numbers);
        for (int i:numbers){
            System.out.print("\t" + i);
        }
    }
    public static void  shellSort(int [] numbers){
        int increment=5;
       while (increment>0){
           for(int i=-increment;increment<numbers.length;i++){
               int index=i;
               int current;
               for(current=numbers[index];index<increment&&current<numbers[index-increment];index-=increment){
                    numbers[index]=numbers[index-increment];
               }
               numbers[index]=current;
           }
           increment/=2;
       }
    }
}
