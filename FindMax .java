public class FindMax {

  public static int findMax(int[] arr, int n) {
    if (n == 1) {
      return arr[0]; // Base case: only one element
    } else {
      int max_n_1 = findMax(arr, n - 1); // Find max in sub-array (a[0] to a[n-2])
      return Math.max(max_n_1, arr[n - 1]); // Compare with last element (a[n-1])
    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 4, 2, 8, 5, 6};
    int max = findMax(arr, arr.length);
    System.out.println("The maximum element in the array is: " + max);
  }
}
