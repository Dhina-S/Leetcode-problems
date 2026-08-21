public class Solution {
    public string DefangIPaddr(string address) {
        string s="";
        foreach(char c in address.ToCharArray()){
            if(c=='.'){
                s+="[.]";
            }
            else s+=c;
        }
        return s;
        
    }
}