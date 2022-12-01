class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        int sum =0;
        int start =0;
        int end = 0;
        if(s==0 || n==0){
            list.add(-1);
            return list;
        }
       for(int i=0;i<n;i++){
           
            sum += arr[i];
            
            
            while(sum>s){
                sum -= arr[start];
                start++;
            }
            
            if(sum == s){
                list.add(start+1);
                list.add(end+1);
                return list;
            }
            end++;
            
        }
        
        list.add(-1);
       
        return list;
    }
}
// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&curated[]=1&sortBy=submissions
