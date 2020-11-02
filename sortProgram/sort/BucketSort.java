package sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BucketSort {

    public static void main(String[] args) {
        int[] arrays = {1,2,1,9,3,6,3,10,2,1,67,12,12,32};
        bucketSort(arrays);
        for (int array : arrays) {
            System.out.print(array+" ");
        }
    }

    private static void bucketSort(int[] arrays) {
        int max=arrays[0],min=arrays[0],index=0;
        //计算最大值最小值
        for (int array : arrays) {
            if (array < min)
                min = array;
            else if (array > max)
                max = array;
        }
        //创建桶(max-min)/bucketSize+1个
        int bucketSize = 5;
        List<Integer>[] linkedLists=new LinkedList[(max-min)/ bucketSize +1];
        //入桶
        for (int array : arrays) {
            index=(array-min)/ bucketSize;
            //把数据放入桶
            if(linkedLists[index]==null){
                linkedLists[index]=new LinkedList<>();
                linkedLists[index].add(array);
            }else {
                insertSort(linkedLists[index],array);
            }
        }
        //出桶
        index=0;
        for (List<Integer> linkedList : linkedLists) {
            if(linkedList!=null){
                int[] ints = linkedList.stream().mapToInt(ii -> ii).toArray();
                System.arraycopy(ints,0,arrays,index,ints.length);
                index+=ints.length;
            }
        }
    }
    //桶内排序插入
    private static void insertSort(List<Integer> list,int number){
        int length=list.size();
        if (list.get(list.size()-1)<number){
            list.add(number);
            return;
        }
        for (int i = 0; i < length; i++) {
            if(list.get(i)>number)
                list.add(i,number);
        }
    }
}
