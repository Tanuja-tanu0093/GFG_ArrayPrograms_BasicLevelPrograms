// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        int arr1[]=new int[2];
        int greaterCount=0;
        int smallerCount=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]<=target)
            {
               smallerCount++; 
            }
             if(arr[i]>=target)
            {
                greaterCount++;
            }
        }
        arr1[0]=smallerCount;
        arr1[1]=greaterCount;
        return arr1;
        
    }
}