package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            scanner.close();
            System.out.println(fibonacci(n));
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}