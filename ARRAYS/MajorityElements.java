package JAVA;
public class MajorityElements {

    public static void Majority(int arr[]) {
        int n = arr.length;
        int threshold = n / 3;

        for (int i = 0; i < n; i++) {
            int count = 1;
            boolean isAlreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isAlreadyCounted = true;
                    break;
                }
            }

            if (isAlreadyCounted) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > threshold) {
                System.out.println("The number: " + arr[i] + " is in majority (appears " + count + " times)");
            } else {
                System.out.println("There isn't any number appearing more times than the threshold");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4 };
        Majority(arr);
    }
}
