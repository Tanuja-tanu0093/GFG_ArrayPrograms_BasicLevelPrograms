// User function Template for Java

class Solution {
    public static String reverseString(String s) {
         String reverse="";
         for(int i=s.length()-1;i>=0;i--)
         {
             reverse=reverse+s.charAt(i);
         }
         return reverse;
        
    }
}