class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int a[]=new int[n];
        int b[]=new int[n];
        a[0]=1;
        b[n-1]=1;
        int ac=1;
        int bc=1;
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]) ac++;
            else ac=1;
            a[i]=ac;
               
        }
         for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]) bc++;
            else bc=1;
            b[i]=bc; 
            
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(a[i]>b[i]) sum+=a[i];
            else sum+=b[i];
        }
        return sum;
        
    }
}