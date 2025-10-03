import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        
        int []arr={-1,0,1,2,-1,-4};
        int target=0;
        Arrays.sort(arr);

        Set<List<Integer>>result=new HashSet<>();

         for(int i=0;i<arr.length-2;i++){

            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                int currentSum=arr[i]+arr[left]+arr[right];
                if(currentSum==target){
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                }else if(currentSum>target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        IO.print(result);
    }
}
