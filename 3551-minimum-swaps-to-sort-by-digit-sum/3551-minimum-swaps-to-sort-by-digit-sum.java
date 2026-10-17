class Solution {
    public int getdigitsum(int num){
        int sum=0; 
        while(num>0){
            sum+=(num%10);
            num/=10;
        }
        return sum;
    }
    public int minSwaps(int[] nums) {
        int n=nums.length;
        Integer[] aftersorted=new Integer[n];
        for(int i=0; i<n; i++){
            aftersorted[i]=nums[i];
        }
        Arrays.sort(aftersorted, (num1, num2)->{
            Integer num1sum=getdigitsum(num1);
            Integer num2sum=getdigitsum(num2);
            if(num1sum!=num2sum){
                return Integer.compare(num1sum, num2sum);
            }
            return Integer.compare(num1, num2);
        });
        Map<Integer, Integer> valtoidx=new HashMap<>();
        for(int i=0; i<n; i++){
            valtoidx.put(aftersorted[i], i);
        }
        int swapcount=0;
        boolean[] visited=new boolean[n];
        for(int i=0; i<n; i++){
            if(visited[i] || valtoidx.get(nums[i])==i)
                continue;
            int cyclesize=0;
            int curr=i;
            while(!visited[curr]){
                visited[curr]=true;
                curr=valtoidx.get(nums[curr]);
                cyclesize++;
            }
            if(cyclesize>0){
                swapcount+=(cyclesize-1);
            }
        }
        return swapcount;
    }
}