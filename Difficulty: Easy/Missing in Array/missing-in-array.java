class Solution {
    int missingNum(int arr[]) {
       int n=arr.length+1;
      int sum=0;
      long sumOfExpected=(long)n*(n+1)/2;
      for(int i=0;i<=arr.length-1;i++)
      {
          int ele=arr[i];
          sum=sum+ele;
      }
      return  (int)sumOfExpected-sum;
       
    }
}
    

