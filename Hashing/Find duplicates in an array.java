class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
      ArrayList<Integer> list = new ArrayList<>();
      
      for(int i=0;i<n;i++){
          int index = arr[i]%n;
          arr[index]+=n;
      }
      
      for(int i=0;i<n;i++){
          if((arr[i]/n)>=2){
              list.add(i);
          }
      }
      
      if(list.size()==0){
          list.add(-1);
          return list;
      }
      
      return list;
    }
}



// 2nd Solution


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashSet<Integer> hs=new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                hs.add(arr[i]);
            }
        }
        ArrayList<Integer> list=new ArrayList<>(hs);
        Collections.sort(list);
        if(list.size()>0){
            return list;
        }else{
            list.add(-1);
            return list;
        }
    }
}
