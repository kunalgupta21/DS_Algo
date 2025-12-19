class Solution {
    public int longestKSubstr(String s, int k) {
       int max=-1;
        int i=0,j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int U=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)==1) U++;
            while(U>k){
                char temp=s.charAt(i);
                map.put(temp,map.get(temp)-1);
                if(map.get(temp)==0){
                    U--;
                }
                i++;
            }
            if (U==k){
                max=Math.max(max,j-i+1);

            }
            j++;
        }
        return max;
    }}