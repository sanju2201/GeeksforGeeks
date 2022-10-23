class Compute {
    
    public void rotate(int arr[], int n)
    {
        int temp =arr[0];
         arr[0]= arr[n-1];
       for(int i=0;i<n-1;i++){
          int num=arr[i+1];
           arr[i+1]= temp;
           temp = num;   
       } 
    }
}
