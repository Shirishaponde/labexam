public class Fibonacci1{

  public static int fibonacciRecursive(int n) {
    if (n <= 1) {
      return n; // Base case: F0 = 0, F1 = 1
    } else {
      return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); // Recursive case: Fi = Fi-1 + Fi-2
    }
  }

  public static void main(String[] args) {
    int n = 10;
    for (int i = 0; i < n; i++) {
      System.out.print(fibonacciRecursive(i) + " ");
    }
  }
}
