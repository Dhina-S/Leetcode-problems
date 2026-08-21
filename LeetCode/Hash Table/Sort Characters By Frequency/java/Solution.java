class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        
            while(!map.isEmpty()){
            int max=Integer.MIN_VALUE;
            char ch=' ';
            for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(max<entry.getValue()){
                max=entry.getValue();
                ch=entry.getKey();
            }
            }
           sb.repeat(ch,max);
            map.remove(ch);
            }
        
        return sb.toString();
        
    }
}