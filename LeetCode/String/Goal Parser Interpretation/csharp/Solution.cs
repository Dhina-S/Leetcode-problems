public class Solution {
    public string Interpret(string command) {
        string s=command.Replace("()","o");
        string a="";
        foreach(char c in s.ToCharArray()){
            if(c=='('||c==')')continue;
            a+=c;
        }
        return a;
        
    }
}