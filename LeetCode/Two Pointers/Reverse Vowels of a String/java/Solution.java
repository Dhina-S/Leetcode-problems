class Solution {
    public String reverseVowels(String s) {
        char c[]=s.toCharArray();
        int l=0,r=c.length-1;
        while(l<r){
            if("aeiouAEIOU".indexOf(c[l])==-1) l++;
            else if("aeiouAEIOU".indexOf(c[r])==-1) r--;
            else{
                char t=c[l];
                c[l]=c[r];
                c[r]=t;
                l++;
                r--;
            }
             
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:c) sb.append(ch);
        return sb.toString();
        
    }
}