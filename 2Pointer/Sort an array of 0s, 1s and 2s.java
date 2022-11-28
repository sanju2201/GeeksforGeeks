class Solution
{
    public static void sort012(int a[], int n)
    {
       int l=0,mid=0,r=n-1;
       for(int i=0;i<n;i++){
           if(a[mid]==0){
               int temp= a[mid];
               a[mid]= a[l];
               a[l]= temp;
               mid++; l++;
           }
           else if(a[mid]==1){
               mid++;
           }
           else if(a[mid]==2){
               int temp = a[mid];
               a[mid]= a[r];
               a[r]= temp;
               r--;
           }
       } 
    }
}
