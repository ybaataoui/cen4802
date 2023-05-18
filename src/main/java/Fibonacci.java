/**
 * Created by Baataoui Youssef
 */
public class Fibonacci {
    /**
     * main method to call other methods
     * Calls fibonacci method and pass a n parameter to it.
     * @param args
     */
    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term in the Fibonacci sequence is: " + result);
    }

    /**
     *
     * @param n The number for the fibonacci method to calculate
     * @return it returns the nth term in the fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
