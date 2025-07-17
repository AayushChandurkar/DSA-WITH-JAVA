package JAVA;

import java.util.Scanner;

public class Factorial_of_n_numbers {
    public static void Factorial(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
    
    
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number to find its factorial:  ");
        int n = sc.nextInt(); 
        Factorial(n); 
        sc.close();
    }
    }
    