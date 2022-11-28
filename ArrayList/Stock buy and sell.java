class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {        
       ArrayList<ArrayList<Integer>> finalList = new ArrayList<>();
        
         int i = 0;
         
         // A[] = {100,180,260,310,40,535,695}
         
         while(i<n-1){
             
             // Searhing for Buying Index
             while( (i<n-1) && A[i]>= A[i+1]){
                 i++;
             }
             if(i==n-1){
                break;
             }
             
             
            ArrayList<Integer> list = new ArrayList<>();
             list.add(i);
             i++;
             
             // Searching for Selling Index
             
             while((i<n) && A[i]>=A[i-1]){
                 i++;
             }
             list.add(i-1);
             finalList.add(list);
                 
         }
         return finalList;
    }
