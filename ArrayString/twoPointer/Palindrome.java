public class Palindrome {
    public static void main(String[] args) {
        
        char []text={'o','p','p','o'};
        int left=0;
        int right=text.length-1;

        /*
        *key note
        * String text="oppo";
        * text.length()
        * text.charAt(index)
        */

        if(text.length<2){
            IO.print("Not Palindrome");
            return;
        }
          

        while(left<right){
            if(text[left]!= text[right]){
                IO.print("Not Palindrome");
                return;
            }else{
                left++;
                right--;
            }
        }
        IO.print("Palindrome");
    }

}
