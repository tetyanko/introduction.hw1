package school.lemon.changerequest.java.introduction.hw1;

public class Task9 {

        public static boolean isPowerOfThree(int n) {
                while (n > 1 && (n % 3) == 0) {
                        n /= 3;
                }
                return n == 1;
        }
}

