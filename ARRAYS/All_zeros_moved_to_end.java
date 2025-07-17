package JAVA;
import java.util.Arrays;
import java.util.Scanner;

public class All_zeros_moved_to_end {

    public static void Count0(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        System.out.println("\nThe number of zeros in the array is: " + count);
    }

public static void End_zero(int arr[]) {
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != 0) {
            arr[index++] = arr[i];
        }
    }
    while (index < arr.length) {
        arr[index++] = 0;
    }
    System.out.println(Arrays.toString(arr));
}



    
            
    
    
    
    

public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    int n = sc.nextInt();
    int arr[]= new int[n];
    System.out.println("Enter the elements of the array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("The Elements of the array are : ");
    for(int i=0; i<n; i++){                                                                                                                            
        System.out.print(arr[i]+" ");
    }
    Count0(arr);
    End_zero(arr);
}
}
