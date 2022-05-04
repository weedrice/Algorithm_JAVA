package easy;

public class FibonacciNumber {
    public int fib(int n) {
        if(n > 1) {
            return fib(n-1) + fib(n-2);
        } else if(n == 1) {
            return 1;
        } else if(n < 0) {
            System.out.println("Wrong Input!");
            return 0;
        } else {
            return 0;
        }
    }
}
