package JAVA;
public class BinarySearchP1 {
    
    public static void BS(int arr[], int target){
        int high = arr.length-1;
        int low = 0;


        while(low<=high){

            int mid = (high+low)/2;

            if(arr[mid]>target){
                high = mid -1; 
            }
            if(arr[mid]<target){
                low = mid+1;
            }
            if(arr[mid] == target){
                System.out.println("Target found on index : "+mid);
                break;
            }

        }
    }

    public static void main(String[] args) {
        int arr[]={2,5,4,6,8,1};
        int target = 6;
        BS(arr, target);
        
    }
}
