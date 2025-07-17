package JAVA;
public class Repeat {

    public static void repeat(int arr[]) {

        boolean same = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    same = true;
                    break;
                }

            }

        }
        System.out.println("The number is repeated : " + same);
    }

    public static void main(String[] args) {

        int arr[] = { 1, 5, 6, 8, 9, 7, 4, 3, 1, 2, 4, 5 };
        repeat(arr);

    }
}
