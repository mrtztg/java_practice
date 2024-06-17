package im.mory.java_practice.c010batch_challenges;

public class Ch003Sqrt {
    int solution(int x) {
        if (x <= 1)
            return x;
        int sqrt = 0;
        int left = 0;
        int right = x / 2;
        while(left <= right) {
            sqrt = (right + left) / 2;
            long pow = (long) sqrt * sqrt;
            if (pow > x)
                right = sqrt - 1;
            else if (pow < x)
                left = sqrt + 1;
            else
                return sqrt;
        }
        return right;
    }
}
