package JAVA;
public class ReverseArray {

    public static void reverse(int arr[]) {

        int N = arr.length - 1;
        int temp[] = new int[(N + 1)];

        for (int i = 0; i < N + 1; i++) {

            temp[i] = arr[N - i];

            System.out.println(temp[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        reverse(arr);
    }
}
