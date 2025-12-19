class Solution {
    public String minWindow(String s, String t) {
        int i=0,j=0;
        Map<Character,Integer> map=new HashMap<>();
        int U=0;
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        U=map.size();
        int min=Integer.MAX_VALUE;
        int[] ans=new int[2];
        ans[1]=-1;
        while (j<s.length()){
            char ch=s.charAt(j);
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if (map.get(ch)==0) U--;
            }
            while (U==0){
                if(min>j-i+1){
                    min=j-i+1;
                    ans[0]=i;ans[1]=j;
                }
                if (map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), map.get(s.charAt(i))+1);
                    if (map.get(s.charAt(i))==1) U++;
                }
                i++;
            }
            j++;
        }
        return s.substring(ans[0],ans[1]+1);
    }}
