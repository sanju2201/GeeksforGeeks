class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

    long firstSum = 0;
    long secondSum = 0;
    
    for(int i=0;i<n;i++){
        firstSum += arr[i];
    }
    
    for(int i=0;i<n;i++){
        firstSum -= arr[i];
        
        if(firstSum == secondSum){
            return i+1;
        }
        secondSum += arr[i];
    }
    return -1;
    }
}

// https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?page=1&curated[]=1&sortBy=submissions
