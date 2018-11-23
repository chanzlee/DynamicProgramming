import java.util.Scanner;

public class DynamicProgramming {
    public static void main(String[] args) {
        System.out.println(Fibonacci());
    }

    public static int Fibonacci() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] memo = new int[input+1];
        return Fibonacci(input, memo);
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
}
