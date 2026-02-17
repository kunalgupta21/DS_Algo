class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n=s.length();
        int i=0,j=0;
        List<String> ans=new ArrayList<>();
        Set<String> set=new HashSet<>();
        while(j<n){



            if(j-i+1==10){
                String temp=s.substring(i,j+1);
                if(set.contains(temp) && !ans.contains(temp)) ans.add(temp);
                else set.add(temp);
                i++;

            }
            j++;
        }
        return ans;
    }
}