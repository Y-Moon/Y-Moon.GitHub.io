package sort;

import java.util.*;

public class RadixSort {
    public static void main(String[] args) {
        int[] arrays={1,2,1,9,111,3,6,3,10,2,1,67,12,12,32};
        Map<Integer,List<Integer>> hashMap=new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put(i,new ArrayList<>());
        }
        radixSort(arrays,hashMap);
        for (int array : arrays) {
            System.out.print(array+"  ");
        }
    }

    private static void radixSort(int[] arrays,Map<Integer,List<Integer>> map) {

        int index=1;
        boolean sign=false;
        while(!sign){
            int mark=0;
            sign=true;
            //将对应位置的值分类到1-10map中
            for (int array : arrays) {
                int i1=array/index;
                if(i1>=10){
                    sign=false;
                    i1%=10;
                }
                map.get(i1).add(array);
            }
            //从1-10取出
            for (int i=0;i<10;i++){
                Object[] objects = map.get(i).toArray();
                map.get(i).clear();
                if (objects.length!=0){
                    for (Object object : objects) {
                        arrays[mark]=(int)object;
                        ++mark;
                    }
                }
            }
            index*=10;
        }
    }
}
