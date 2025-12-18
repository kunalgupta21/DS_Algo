// User function Template for Java

class Solution {

    int search(String s, String str) {
        // code here
         int k=s.length();
        int n=str.length();
        int i=0,j=0;
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int ans=0;
        int U=map.size();
        while(j<n){
            char ch=str.charAt(j);
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
                if (U==0) ans++;
                char temp=str.charAt(i);
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