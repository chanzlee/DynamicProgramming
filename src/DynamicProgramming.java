import java.util.Scanner;

public class DynamicProgramming {
    public static void main(String[] args) {
        Fibonacci();
    }

    public static void Fibonacci() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(Fibonacci(input));
    }

    public static int Fibonacci(int n) {
        if (n <=1 ) {
            return n;
        } else {
            return Fibonacci(n-1) + Fibonacci( n-2);
        }
    }
}
