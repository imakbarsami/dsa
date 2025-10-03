import java.util.Arrays;

public class MergeArraySort {
    public static void main(String[] args) {
        int []a={1,3,0,5};
        int []b={8,2,7,3};
        int []c=new int[a.length+b.length];

        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }

        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }

        Arrays.sort(c);

       IO.print(Arrays.toString(c));
    }
}
