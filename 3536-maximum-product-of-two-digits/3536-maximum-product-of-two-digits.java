class Solution {
    public int maxProduct(int n) {
        List<Integer> res = new ArrayList<>();
        while (n > 0) {
            int digit = n % 10;
            res.add(digit);
            n /= 10;
        }
        Collections.sort(res);
        int ans = res.get(res.size() - 1) * res.get(res.size() - 2);
        return ans;
    }
}