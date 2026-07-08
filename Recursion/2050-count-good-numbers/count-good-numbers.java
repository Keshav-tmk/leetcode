// class Solution {
//     private int m = 1_000_000_007;

//     private int help(int i, long n) {
//         if (i == n)
//             return 1;
//         int res = 0;

//         if (i % 2 == 0) {
//             res = (res + 5 * help(i + 1, n)) % m;
//         } else {
//             res = (res + 4 * help(i + 1, n)) % m;
//         }
//         return res;
//     }

//     public int countGoodNumbers(long n) {
//         return help(0, n);

//     }
// }
class Solution {

    static final int MOD = 1_000_000_007;

    // Computes (x^n) % MOD
    private long power(long x, long n) {
        if (n == 0)
            return 1;

        long half = power(x, n / 2);

        if (n % 2 == 0) {
            return (half * half) % MOD;
        } else {
            return (((half * half) % MOD) * x) % MOD;
        }
    }

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long evenWays = power(5, even);
        long oddWays = power(4, odd);

        return (int) ((evenWays * oddWays) % MOD);
    }
}