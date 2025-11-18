class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
            
        }
        al.add(min);
        al.add(max);
        return al;
        
    }
}
