class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        LinkedList<Integer> list = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && stack.peek()>=a[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                list.add(-1);
            }
            else{
                list.add(stack.peek());
            }
             stack.push(a[i]);
        }
        return list;
    }
   
}

// https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
