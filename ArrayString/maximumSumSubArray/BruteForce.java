public class BruteForce {
    public static void main(String[] args) {

        int []arr={3,8,2,5,7,6,12};
        int windowSize=4;
        int max=0;
        int n=arr.length;

        for(int i=0;i<=n-windowSize;i++){
            int currentSum=0;
            for(int j=i;j<=windowSize+i-1;j++){
                currentSum+=arr[j];
            }
            max=Math.max(max, currentSum);
        }

        IO.print("Maximum Sum SubArray = "+max);
    }
}
