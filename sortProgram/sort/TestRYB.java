package sort;

public class TestRYB {
    public static void main(String[] args) {
        char[] RYB={'r','r','b','y','b','y'};
        sort(RYB);
        for (char c : RYB) {
            System.out.print(c+"  ");
        }
    }private static void swap(char [] c,int a,int b){
        char temp=c[b];
        c[b]=c[a];
        c[a]=temp;
    }
    private static void sort(char[] ryb) {
        int r=0,b=ryb.length-1,y=0;

        for(int i=0;i<b;++i){
            switch (ryb[i]){
                case 'r':{
                    swap(ryb,r,i);
                    ++r;
                    break;
                }
                case 'b':{
                    swap(ryb,b,i);
                    --b;
                    break;
                }
            }
        }
    }
}
