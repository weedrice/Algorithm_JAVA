import easy.ClimbingStairs;
import easy.FibonacciNumber;
import easy.MinCostClimbingStairs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        System.out.println("FibonacciNumber(2) = " + fibonacciNumber.fib(2));

        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println("climbingStairs = " + climbingStairs.climbStairs(3));
        System.out.println("climbingStairs = " + climbingStairs.climbStairs(2));
        System.out.println("climbingStairs = " + climbingStairs.climbStairs(1));

        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
        System.out.println("minCostClimbingStairs = " + minCostClimbingStairs.minCostClimbingStairs(new int[]{10, 15, 20}));
        System.out.println("minCostClimbingStairs = " + minCostClimbingStairs.minCostClimbingStairs(new int[]{0, 0, 2, 1}));
        System.out.println("minCostClimbingStairs = " + minCostClimbingStairs.minCostClimbingStairs(new int[]{0, 0, 1, 2}));
        System.out.println("minCostClimbingStairs = " + minCostClimbingStairs.minCostClimbingStairs(new int[]{0, 1, 2, 2}));
        System.out.println("minCostClimbingStairs = " + minCostClimbingStairs.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
}
