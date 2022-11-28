class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long ans[] = new long[n];
        Stack<Long> stack = new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    } 
}

// https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1?utm_source=gfg&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
