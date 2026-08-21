class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int l=0,r=0;
        int n=s.length();
        int max=0;
        while(r<n){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
             max=Math.max(max,r-l+1);
            set.add(s.charAt(r));
            r++;
        }
        return max;
        
    }
}