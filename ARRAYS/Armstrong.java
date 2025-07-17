package JAVA;
import java.util.*;

public class Armstrong {

    public static void armstrong(int n) {
        int num = 0;
        int original = n;
        while (n > 0) {
            int a = n % 10;
            num = num + (int) Math.pow(a, 3);
            n = n / 10; 
        }
        System.out.println("The summation of cube of each digit is: " +num);
        if (num == original) {
            System.out.println("The number is an armstrong number");
        } else {
            System.out.println("The number is not an armstrong number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        armstrong(n);
        sc.close();
    }
}
