class Solution {

    private int nextSum(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public boolean isHappy(int n) {
        Set<Integer> digits = new HashSet<>();
        while (n != 1 && !digits.contains(n)) {
            digits.add(n);
            n = nextSum(n);
        }
        return n == 1;
    }
}
