package algo.tzashinorpu.GSSY.DoublePoint;

public class divide_29 {
    public int divide(int dividend, int divisor) {
        long x = dividend, y = divisor;
        boolean isNeg = (x < 0 && y > 0) || (x > 0 && y < 0);
        if (x < 0) x = -x;
        if (y < 0) y = -y;

        long l = 0, r = x;
        while (l < r) {
            long mid = l + r + 1 >> 1;
            if (mul(mid, y) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        long ans = isNeg ? -l : l;
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) return Integer.MAX_VALUE;
        return (int) ans;
    }

    long mul(long a, long k) {
        // 2*5(0101)
        long ans = 0;
        while (k > 0) {
            if ((k & 1) == 1) ans += a;
            k >>= 1;
            a += a;
        }
        return ans;
    }
}
