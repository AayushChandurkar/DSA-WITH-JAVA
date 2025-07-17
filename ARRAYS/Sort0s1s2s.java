package JAVA;

public class Sort0s1s2s {

    public static void sort012(int arr[]) {
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        int temp[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                cnt0++;
            }
            if (arr[i] == 1) {
                cnt1++;
            }
            if (arr[i] == 2) {
                cnt2++;
            }
        }
        System.out.println(cnt0 + " " + cnt1 + " " + cnt2);
        for (int i = 0; i < cnt0; i++) {
            temp[i] = 0;
        }

        for (int i = cnt0; i < (cnt0 + cnt1); i++) {

            temp[i] = 1;

        }
        for (int i = cnt1 + cnt0; i < arr.length; i++) {
            temp[i] = 2;
        }
        System.out.println("Sorted array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(temp[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 2, 2, 1, 2, 1 };
        sort012(arr);
    }
}
