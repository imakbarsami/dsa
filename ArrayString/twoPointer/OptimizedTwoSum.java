public class OptimizedTwoSum {
    public static void main(String[] args) {

        int []arr={1,2,3,5,7,10,11,15};
        int target=3;
        int left=0;
        int right=arr.length-1;
        
        while (left<right) {
            int currentSum=arr[left]+arr[right];
            if(currentSum==target){
                IO.print("Index are : "+left+","+right);
                return;
            }else if(currentSum>target){
                right--;
            }else{
                left++;
            }
        }
    }
}
