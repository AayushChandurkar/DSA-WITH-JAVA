package JAVA;

public class CountReversePairs {

    public static void Count(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > 2 * arr[j]) {
                    System.out.println("The pair is : (" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 4 };
        Count(arr);
    }
}
