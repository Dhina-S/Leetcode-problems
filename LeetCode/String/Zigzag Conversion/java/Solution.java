class Solution {
    public String convert(String s, int numRows) {
        int freq[]=new int[s.length()];
        int i=0;
        while(i<s.length()){
            for(int j=1;j<=numRows && i<s.length();j++){
                freq[i++]=j;
            }
            for(int k=numRows-1;k>=2 && i<s.length();k--){
                freq[i++]=k;
            }
        }
        //System.out.print(Arrays.toString(freq));
        StringBuilder sb=new StringBuilder();
        for(int k=1;k<=numRows;k++){
            for(int j=0;j<freq.length;j++){
                if(k==freq[j]){
                    sb.append(s.charAt(j));
                }
            }
        }
        return sb.toString();
        
    }
}