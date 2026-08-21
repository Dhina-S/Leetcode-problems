public class Solution {
    public int[] Shuffle(int[] nums, int n) {
        int[] a=new int[nums.Length];
        int k=0;
        for(int i=0;k<nums.Length;i++){
            a[k++]=nums[i];
            a[k++]=nums[n++];
        }
        return a;
    }
}