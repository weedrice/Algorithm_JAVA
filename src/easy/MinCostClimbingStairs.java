package easy;

import java.util.Arrays;

public class MinCostClimbingStairs {
    int[] dp;

    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        dp = new int[length];

        return Math.min(calcNextIdx(cost, length - 1), calcNextIdx(cost, length - 2));
    }

    public int calcNextIdx(int[] cost, int idx) {
        if (idx < 0) {
            return 0;
        }
        if (idx == 0 || idx == 1) {
            return cost[idx];
        }
        if (dp[idx] != 0) {
            return dp[idx];
        }

        dp[idx] = cost[idx] + Math.min(calcNextIdx(cost, idx - 1), calcNextIdx(cost, idx - 2));
        return dp[idx];
    }
}
