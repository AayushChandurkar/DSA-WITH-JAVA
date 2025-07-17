package JAVA;
public class Sum3 {

    public static void sum(int arr[]) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println("The three numbers that sum to 0 are: "
                                + arr[i] + ", " + arr[j] + ", " + arr[k]);
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("There are no such triplets :)");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -3, 4, -1, -2, 0 };
        sum(arr);
    }
}
