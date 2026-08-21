class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=0;
        double n=nums.length;
        double max=Integer.MIN_VALUE,sum=0;
        while(r<n){
            sum+=nums[r];
            if(r-l+1 ==k ){
                max=Math.max(max,sum);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        return max/k ;
        
    }
}