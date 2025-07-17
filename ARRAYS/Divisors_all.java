package JAVA;
import java.util.*;
public class Divisors_all {
    
    public static void all_divsors(int n){         // BRUTE FORCE APPROACH 
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find its all Divisors:  ");
        int n = sc.nextInt();
        all_divsors(n);
        sc.close();
    }
}

