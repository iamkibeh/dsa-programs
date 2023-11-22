package gcd;

public class Gcd {
    public static int computeGcd(int m, int n) {
        // Ensure that m is greater than or equal to n
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }

        // Find the remainder
        int remainder = m % n;

        // Base case: if remainder is 0, then n is the GCD
        if (remainder == 0) {
            return n;
        }

        // Recursive case: call the method again with n as the new m and remainder as the new n
        return computeGcd(n, remainder);
    }

    public static void main(String[] args) {
        int m = 24;
        int n = 36;

        int gcd = computeGcd(m, n);
        System.out.println("The GCD of " + m + " and " + n + " is: " + gcd);
    }
}
