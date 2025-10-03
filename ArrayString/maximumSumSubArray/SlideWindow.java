public class SlideWindow {
    public static void main(String[] args) {
        
        int []arr={3,8,2,5,7,6,12};
        int windowSize=4;
        int n=arr.length;
        int currentSum=0,max=0;

        for(int i=0;i<windowSize;i++){
            currentSum+=arr[i];
        }

        max=currentSum;
        for(int i=1;i<=n-windowSize;i++){
            currentSum=currentSum+arr[windowSize+i-1]-arr[i-1];
            max=Math.max(max, currentSum);
        }

        IO.print("Maximum Sum SubArray = "+max);

    }
}
