class Solution {
    public int maxStarSum(int[] vals, int[][] edges, int k) {
        int n=vals.length, ans=Integer.MIN_VALUE;
        List<List<Integer>> adj=new ArrayList();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(vals[v]);
            adj.get(v).add(vals[u]);
        }
        for(int i=0; i<n; i++){
            Collections.sort(adj.get(i), Collections.reverseOrder());
        }
        for(int i=0; i<n; i++){
            int sum=vals[i];
            List<Integer> neighbors=adj.get(i);
            for(int j=0; j<Math.min(k, neighbors.size()); j++){
                if(neighbors.get(j)>0){
                    sum+=neighbors.get(j);
                }
                else{
                    break;
                }
            }
            ans=Math.max(ans, sum);
        }
        return ans;
    }
}