public class ValidAnagaram {

    public static boolean isAnagram(String s,String t){

        if(s.length()!=t.length()){
            return false;
        }

        int []count =new int [26];

        /*
         * nagram
         * n=1,a=2,g=1,r=1,m=1
         * 'a'=97
         * for a 97-97=0, count[0]=2 cause 2 times come
         */

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }

        for(int i=0;i<t.length();i++){
            count[t.charAt(i)-'a']--;
        }

        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {  
        
        String s="nagaram";
        String t="anagram";
        //its true


        /*
         * String s="cat";
         * String t="rat";
         * its false
         */

        IO.print(isAnagram(s, t));
    }
    
}