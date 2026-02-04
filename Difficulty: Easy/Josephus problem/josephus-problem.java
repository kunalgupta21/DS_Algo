class Solution {
    public int josephus(int n, int k) {
        return josephusRec(n, k) + 1; // convert to 1-based
    }

    private int josephusRec(int n, int k) {
        if (n == 1)
            return 0;

        return (josephusRec(n - 1, k) + k) % n;
    }
}
