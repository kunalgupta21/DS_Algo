class Solution {
    public int longestSubstring(String s, int k) {
       
        int n=s.length();
        int ans=0;int t=0;
        for(int i=0;i<n;i++){
            int j=i;
             HashMap<Character,Integer> map=new HashMap<>();
            while(j<n){
                
                char ch=s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(isvalid(map,k)){
                    ans=Math.max(ans,j-i+1);
                }
                j++;
            }
        }
        return ans;
    }
    public boolean isvalid(HashMap<Character,Integer> map,int k){
        for(Map.Entry<Character,Integer> entry :map.entrySet()){
            if(entry.getValue()<k) return false;
        }
        return true;
    }
}