class Solution {
    public int[] countOddEven(int[] arr) {
        int [] evenOdd=new int[2];
        int evenCount=0;
        int oddCount=0;
        for(int temp:arr)
        {
            if(temp%2==0)
            
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
            
        }
        evenOdd[0]=oddCount;
        evenOdd[1]=evenCount;
        return evenOdd;
        
        
    }
}