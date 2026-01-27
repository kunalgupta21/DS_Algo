class Solution {
    public int findCircleNum(int[][] iscon) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<iscon.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<iscon.length;i++){
            for(int j=0;j<iscon[0].length;j++){
                if(iscon[i][j]==1  && i!=j){
                    adj.get(i).add(j);

                }
            }
        }
    

    boolean[] isvis=new boolean[adj.size()];
    int count=0;
    for(int i=0;i<adj.size();i++){
        if(!isvis[i]){
            dfs(i,isvis,adj);
            count++;
        }
    }
    return count;
}
public void dfs(int node,boolean[] isvis,ArrayList<ArrayList<Integer>> adj){
    isvis[node]=true;

    for(int temp:adj.get(node)){
        if(!isvis[temp]){
            dfs(temp,isvis,adj);
        }
    }
}
}
