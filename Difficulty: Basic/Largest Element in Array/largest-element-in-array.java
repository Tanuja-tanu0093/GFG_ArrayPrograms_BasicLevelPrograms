class Solution {
    public static int largest(int[] arr) {
        
        int largest=Integer.MIN_VALUE;
        for(int temp:arr)
        {
            if(temp>largest)
            {
                largest=temp;
            }
        }
        return largest;
        
    }
}
       