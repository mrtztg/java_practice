package im.mory.java_practice.c010batch_challenges;

public class Ch011HappyNumber {
    public boolean find(int num) {
        int slow = num, fast = num;
        while (slow != 1 || fast != 1) {
            slow = squareOfNums(slow);
            fast = squareOfNums(fast);
            fast = squareOfNums(fast);
            if (fast == slow) {
                return false;
            }
        }
        return true;
    }

    private int squareOfNums(int num) {
        int wholeSquare = 0;
        int temp = num;
        int numDigits = 0;
        while (temp > 0) {
            temp /= 10;
            numDigits++;
        }

        // Iterate over each digit
        for (int i = numDigits - 1; i >= 0; i--) {
            int divisor = (int) Math.pow(10, i);
            int digit = num / divisor;
            num %= divisor;
            wholeSquare += (int) Math.pow(digit, 2);
        }
        return wholeSquare;
    }
}
