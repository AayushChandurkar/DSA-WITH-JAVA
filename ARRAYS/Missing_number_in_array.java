package JAVA;

public class Missing_number_in_array {
    public void Mnumber(int arr[]){
        int n = arr.length+1;
        int sum = (n*(n+1))/2;
        int total =0;
        for(int i=0; i<arr.length; i++){
            total = total+arr[i];
        }
        System.out.println("Missing number is: "+(sum-total));
    }


public static void main(String[] args) {
    Missing_number_in_array obj = new Missing_number_in_array();
    int arr[] = {1,2,3,5};
    obj.Mnumber(arr);
}
}