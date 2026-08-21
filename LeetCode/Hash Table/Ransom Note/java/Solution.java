class Solution {
    public boolean canConstruct(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(map.containsKey(c)){
                map.replace(c,map.get(c)-1);
            }
        }
        System.out.print(map);
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>0) return false;
        }
        return true;
    }
}