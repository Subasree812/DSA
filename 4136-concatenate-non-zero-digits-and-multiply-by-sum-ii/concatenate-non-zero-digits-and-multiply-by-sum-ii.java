class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        long MOD = 1_000_000_007;
        int len = s.length();

        long[] preSum = new long[len + 1];
        long[] preProd = new long[len + 1];
        int[] non0 = new int[len + 1];
        long[] p10 = new long[len + 1];

        p10[0] = 1;
        for (int i = 0; i < len; i++) {
            p10[i + 1] = (p10[i] * 10) % MOD;

            int digit = s.charAt(i) - '0';
            preSum[i + 1] = preSum[i] + digit;

            if (digit == 0) {
                preProd[i + 1] = preProd[i];
                non0[i + 1] = non0[i];
            } else {
                preProd[i + 1] = (preProd[i] * 10 + digit) % MOD;
                non0[i + 1] = non0[i] + 1;
            }
        }

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            long sum = preSum[end + 1] - preSum[start];

            int cnt = non0[end + 1] - non0[start];

            long sub = (preProd[start] * p10[cnt]) % MOD;
            long x = (preProd[end + 1] - sub + MOD) % MOD;

            res[i] = (int) ((x * sum) % MOD);
        }

        return res;
    }
}