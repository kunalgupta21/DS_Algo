class Solution {
    public int characterReplacement(String s, int k) {
     int n=s.length();
     int i=0,j=0;
     HashMap<Character,Integer> map=new HashMap<>();
     int len=0;
     while(j<n){
        char ch=s.charAt(j);
        map.put(ch,map.getOrDefault(ch,0)+1);
        if(isvalid(map)<=k){
            len=Math.max(len,j-i+1);

        }else{
            while(isvalid(map)>k){
                char temp=s.charAt(i);
                map.put(temp,map.get(temp)-1);
                if(map.get(temp)==0) map.remove(temp);
                i++;
            }
        }
        j++;



     }
     return len;

    }
    int isvalid(HashMap<Character,Integer> map){
        int cnt=0;
        int max=0;
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            cnt+=e.getValue();
            max=Math.max(max,e.getValue());
        }
        return cnt-max;
    }
}