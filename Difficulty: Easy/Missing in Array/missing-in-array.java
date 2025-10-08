class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1;
        long actualSum = (long)n * (n + 1) / 2;  
        long sum = 0;                             

        for (int temp : arr) {
            sum = sum + temp;
        }

        return (int)(actualSum - sum);  
    }
}
