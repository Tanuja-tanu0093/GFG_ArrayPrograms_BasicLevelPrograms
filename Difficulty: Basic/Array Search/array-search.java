class Solution {
    public int search(int arr[], int x) {
        
       for(int i=0;i<=arr.length-1;i++)
       {
           if(x==arr[i])
           {
               return i;
           }
       }
       return -1;
    }
}
