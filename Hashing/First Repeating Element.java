// O(n^2) approach

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]== arr[j]){
                    return i+1;
                }
            }
        }
        return -1;
    }
}


// optimise Approach O(n)

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
       HashSet<Integer> set = new HashSet<>();
       int temp=-1;
       for(int i=n-1; i>=0;i--){
           if(set.contains(arr[i])){
               temp=i;
           }
           else {
               set.add(arr[i]);
           }
       }
       if(temp>=0){
           return temp+1;
       }
       
        return -1;
    }
}
