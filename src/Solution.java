public class Solution {
    public int numberOfSteps(int num) {

        int target = 0;
        int steps = 0;

        while (num > target) {
            if (num % 2 == 0) {
                num = num / 2;
            }
            else
                num = num - 1;
            steps++;
        }
        return steps;
    }
}
