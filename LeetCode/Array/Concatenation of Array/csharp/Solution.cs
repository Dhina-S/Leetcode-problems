public class Solution {
    public int[] GetConcatenation(int[] nums) {
        int n=nums.Length;
        int[] a=new int[2*n];
        for(int i=0;i<nums.Length;i++){
           a[i]=nums[i];
           a[i+n]=nums[i];
        }
        return a;
        
    }
}