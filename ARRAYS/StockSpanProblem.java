package JAVA;
import java.util.*;

public class StockSpanProblem {
    public static void Span(int arr[], Deque<Integer> Stack, int count) {

        for (int i = 0; i < arr.length; i++) {
            count = 1; 
            for (int j = i - 1; j >= 0; j--) { 
                if (arr[i] >= arr[j]) {
                    count++;
                } else {
                    break; 
                }
            }
            Stack.push(count);
        }

        System.out.println(Stack);
    }

    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 70, 60, 75, 85 };
        Deque<Integer> Stack = new ArrayDeque<>();
        int count = 1;
        Span(arr, Stack, count);
    }
}
