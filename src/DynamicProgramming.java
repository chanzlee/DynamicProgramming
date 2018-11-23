import java.util.Scanner;

public class DynamicProgramming {
    public static void main(String[] args) {
        System.out.println(Fibonacci());
    }

    public static long Fibonacci() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
//        int[] memo = new int[input+1];
//        return Fibonacci(input, memo);
        return FibonacciBottomUp(input);
    }

    public static int Fibonacci(int n, int[] memo) {
        if (n <= 1 ) {
            return n;
        } else if (memo[n] > 0) {
            return memo[n];
        } else {
            return memo[n] = Fibonacci(n-1, memo) + Fibonacci( n-2, memo);
        }
    }

    public static long FibonacciBottomUp (int n) {
        long [] d = new long[n+1];
        d[0] = 0;
        d[1] = 1;
        for (int i=0; i <= n-2; i++) {
            d[i+2] = d[i] + d[i+1];
        }
        return d[n];
    }
}
