class Solution {
    public void reverseString(char[] s) {
        int k=0;
        int l=s.length-1;
       while(k<=l){
        char temp=s[k];
        s[k]=s[l];
        s[l]=temp;
        k++;
        l--;
       }
        }
    }
