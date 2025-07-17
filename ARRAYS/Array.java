package JAVA;

import java.util.*;

public class Array {

    public static void Largestelement(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The highest element in the array is: " + max);
    }

    public static void Checksort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("The array is not sorted");
                return;
            }
        }
        System.out.println("The array is sorted");
    }

    public static void Target(int arr[]) {
        int target = 10;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {

                }
            }
        }
    }

    /*
    public static void Remove_duplicates(int arr[]){
        int n = arr.length;
        for(int i = 0; i< n-1; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] == arr[j]){                    
                    arr[i];
                }
            }
        }   
    }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Largestelement(arr);
        Checksort(arr);
        sc.close();
    }
}
