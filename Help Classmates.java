class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	    int ans[] = new int[n];
	    Stack<Integer> stack = new Stack<>();
	    for(int i=n-1;i>=0;i--){
	        while(!stack.isEmpty() && stack.peek()>= arr[i]){
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


// https://practice.geeksforgeeks.org/problems/fab3dbbdce746976ba35c7b9b24afde40eae5a04/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
