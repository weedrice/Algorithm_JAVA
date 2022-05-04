package easy;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int oneStepBefore = 2;
        int twoStepBefore = 1;
        int now = 0;

        if (n == 2) {
            return oneStepBefore;
        } else if (n == 1) {
            return twoStepBefore;
        } else if (n == 0) {
            return now;
        }

        for (int i = 2; i < n; i++) {
            now = oneStepBefore + twoStepBefore;
            twoStepBefore = oneStepBefore;
            oneStepBefore = now;
        }

        return now;
    }
}
