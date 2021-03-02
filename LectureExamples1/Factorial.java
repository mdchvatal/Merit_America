package LectureExamples1;

public class Factorial {

    private static final int MAX_NUM = 20;

    public static void main(String[] args) {
        for(int i = 0; i < MAX_NUM; i++) {
            System.out.println((i + "! = " + factorial(i)));
        }

    }

    private static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
