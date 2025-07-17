package JAVA;
import java.util.*;
public class Sum_of_n {
    public static void Summation(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of first " + n + " natural numbers is " + sum);
    }
    




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number of natural numbers you want to sum: ");
        int n = sc.nextInt(); 
        Summation(n); 
        sc.close();
}
}