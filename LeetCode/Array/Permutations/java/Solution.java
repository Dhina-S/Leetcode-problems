class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        boolean b[]=new boolean[nums.length];
        per(nums,list,b,new ArrayList<>());
        return list;
    }
    public void per(int[] nums,List<List<Integer>> list,boolean[] b,List<Integer> l){
        if(l.size()==nums.length){
            list.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!b[i]){
            b[i]=true;
            l.add(nums[i]);
            per(nums,list,b,l);
            l.remove(l.size()-1);
            b[i]=false;
            }
        }
    }
}