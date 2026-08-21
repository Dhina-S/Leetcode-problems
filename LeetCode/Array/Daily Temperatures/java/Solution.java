class Solution {
    public int[] dailyTemperatures(int[] nums) {
         Stack<Integer> st=new Stack<>();
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty()&&nums[st.peek()]<nums[i]){
                arr[st.peek()]=i-st.pop();
            }
            st.push(i);
        }
        return arr;
        
    }
}