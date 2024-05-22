//Using Linera search
public class NthRoot1{
    // Power exponential method:
    public static long func(int b, int exp) {
        long  ans = 1;
        long base = b;
        while (exp > 0) {
            if (exp % 2 == 1) {
                exp--;
                ans = ans * base;
            } else {
                exp /= 2;
                base = base * base;
            }
        }
        return ans;
    }

    public static int NthRoot(int n, int m) {
        //Use linear search on the answer space:
        for (int i = 1; i <= m; i++) {
            long val = func(i, n);
            if (val == (long)m) return i;
            else if (val > (long)m) break;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 3, m = 27;
        System.out.println(NthRoot(n, m));
    }
}



