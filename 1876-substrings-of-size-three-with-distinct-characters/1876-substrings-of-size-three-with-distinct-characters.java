class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        int i=0,j=0;
        Map<Character,Integer> map=new HashMap<>();
        
        while(j<s.length()){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(j-i+1==3){
                char left=s.charAt(i);
                if(map.size()==3) count++;
                map.put(left,map.get(left)-1);
                if(map.get(left)==0) map.remove(left);
                i++;
            }
            j++;
        }
        return count;
    }
}