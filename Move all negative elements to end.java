class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int temp[] = new int [n];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                temp[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                temp[k]=arr[i];
                k++;
            }
        }
        
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        
    }
}
