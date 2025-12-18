class Solution {
    public List<Integer> findAnagrams(String s, String str) {
        int k=str.length();
        int n=s.length();
        int i=0,j=0;
        List<Integer> ans=new ArrayList<>();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
       
        int U=map.size();
        while(j<n){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if (map.get(ch)==0){
                    U--;
                }
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if (U==0) ans.add(i);
                char temp=s.charAt(i);
                if (map.containsKey(temp)){
                    map.put(temp,map.get(temp)+1);
                    if (map.get(temp)==1) U++;
                }
                i++;j++;

            }

        }
        return ans;
    }
}