class Solution {
    public boolean isPalindrome(String s) {
        char[] c=s.toCharArray();
        
        return rev(c,0,c.length-1);
    }
    public boolean rev(char[] c,int l,int r){
    if(l>=r) return true;
    if(!Character.isLetterOrDigit(c[l])) return rev(c,l+1,r);
    if(!Character.isLetterOrDigit(c[r])) return rev(c,l,r-1);

    
    if(Character.toLowerCase(c[l])!=Character.toLowerCase(c[r])){
            return false;
    }
    
       
     return  rev(c,l+1,r-1);
    }
}