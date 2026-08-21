public class Solution {
    public string Convert(string s, int n) {
        int[] a=new int[s.Length];
        int k=0;
        while(k<s.Length){
            for(int i=1;i<=n&&k<s.Length;i++){
                a[k++]=i;
            }
           for(int i=n-1;i>=2&&k<s.Length;i--){
                a[k++]=i;
            }
        }
       StringBuilder sb=new StringBuilder();
       for(int i=1;i<=n;i++){
        for(int j=0;j<a.Length;j++){
            if(i==a[j]){
                sb.Append(s[j]);
            }
        }
       }
        
        return sb.ToString();
        // foreach(int i in a){
        //     Console.Write(i);
        // }
        // return s;
    }
}