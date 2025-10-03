
public class TraditionalTwoSum {

    public static void main(String[] args) {
        
        int []arr={1,2,3,5,7,10,11,15};
        int target=15;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    IO.print("Index are : "+i+","+j);
                    return;
                }
            }
        }
    }
}