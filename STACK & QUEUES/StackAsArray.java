package JAVA;
import java.util.*;

class StackAsArray{
    
    public static int[] push(int x,int arr[]){
        int i = 0;
        while(arr[i] != 0){
            i = i+1;
        }
        arr[i] = x;
        return arr;
    }

    public static int[] pop(int arr[]){
        if (size(arr) == 0) {
            System.out.println("Stack Underflow");
            return arr;
        }
        arr[size(arr)-1] = 0;
        return arr;
    }

    public static int topval(int arr[]){
        if (size(arr) == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[size(arr)-1];
    }


    public static int size(int arr[]){
        int size = 0;
        int i = 0;
        while(arr[i] != 0){
            i++;
            size++;
        }
        return size;
    }
    public static void main(String[] args) {
        int arr[] = new int[10];

        push(5, arr);
        push(6, arr);
        push(7, arr);
        push(8, arr);
        pop(arr);
        pop(arr);
        push(9, arr);
        pop(arr);
        pop(arr);
        pop(arr);
        System.out.print("[ ");
        for(int i = 0; i<size(arr); i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("The size of the stack is : "+size(arr));
        System.out.println("The top value is : "+topval(arr));
        System.out.println("The stack capacity is : "+arr.length);
    }
}
