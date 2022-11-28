class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            
        }
        
        for(int x : map.keySet()){
            if(map.get(x)==1){
                return x;
            }
        }
        return 0;
    }  
    
}
