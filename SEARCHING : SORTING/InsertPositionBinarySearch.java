package JAVA;

import java.util.Arrays;

public class InsertPositionBinarySearch {

    public static void BS(int arr[], int target) {
        
        Arrays.sort(arr);
        int low = 0, high = arr.length - 1;
        int insertPos = arr.length; 

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Target found at index: " + mid);
                return;
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                insertPos = mid;
                high = mid - 1;
            }
        }

        System.out.println("Target not found. Should be inserted at index: " + insertPos);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 4, 6, 8, 1 };
        int target = 5;
        BS(arr, target);
    }
}
