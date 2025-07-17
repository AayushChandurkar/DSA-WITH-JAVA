package JAVA;

import java.util.*;

public class Median2arraysSorted {

    public static void mergeNmedian(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;

        int merger[] = new int[m + n];

        for (int i = 0; i < m; i++) {
            merger[i] = arr1[i];
        }
        for (int j = 0; j < n; j++) {
            merger[m + j] = arr2[j];
        }

        Arrays.sort(merger);
        System.out.print("THE MERGED ARRAY : ");
        for (int i = 0; i < m + n; i++) {
            System.out.print(merger[i] + "   ");
        }

        int M = merger.length;
        if (M % 2 == 0) {
            int mid1 = M / 2;
            int mid2 = (M / 2) - 1;
            double median = (merger[mid1] + merger[mid2]) / 2.0;
            System.out.println("\nTHE MEDIAN OF THE MERGED ARRAY IS : " + median);
        } else {
            int mid = M / 2;
            System.out.println("\nTHE MEDIAN OF THE MERGED ARRAY IS : " + merger[mid]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 2, 4, 6, 8, 10 };
        mergeNmedian(arr1, arr2);
    }
}
