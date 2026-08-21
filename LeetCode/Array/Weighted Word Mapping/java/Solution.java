class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res="";
        for(String s:words){
            int count=0;
            for(char c:s.toCharArray()){
                count+=weights[c-'a'];
            }
            int a=count%26;
            int b=26-a;
            res+=String.valueOf((char)('a' + b - 1));
            System.out.print(res);
        }
        return res;
    }
}