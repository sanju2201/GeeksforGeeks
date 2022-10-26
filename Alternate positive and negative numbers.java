class Solution {
    void rearrange(int arr[], int n) {
        // code here
  ArrayList <Integer> pos = new ArrayList<>();
  ArrayList <Integer> neg = new ArrayList<>();
  
  for(int i=0;i<n;i++){
      if(arr[i]>=0){
          pos.add(arr[i]);
      }
      else{
          neg.add(arr[i]);
      }
  }
  
      int i=0,j=0,k=0;
       while(k<arr.length){
           if(i<pos.size()){
               arr[k]=pos.get(i);
               i++;
               k++;
           }
           if(j<neg.size()){
               arr[k]= neg.get(j);
               j++;
               k++;
           }
           
       }

        }
    }
