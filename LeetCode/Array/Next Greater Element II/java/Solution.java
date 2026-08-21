class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int arr[]=new int[nums.length];
        Arrays.fill(arr,-1);
        for(int i=0;i<2*nums.length;i++){
            while(!st.isEmpty()&&nums[st.peek()]<nums[i%nums.length]){
                arr[st.pop()]=nums[i%nums.length];
            }
            st.push(i%nums.length);
        }
        return arr;
        
    }
}