package JAVA;

public class Sum2 {
    

    public static void Sum(int arr[], int target){
        int n = arr.length;

        for (int i=0; i<n; i++){
            for (int j = i+1; j<n; j++){
                if (arr[i] + arr[j] == target){
                    System.out.println("Target achieved at index " + i + " and " + j);
            }
        }

    }
    }

    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int target = 3;
        Sum(arr, target);
}
}
