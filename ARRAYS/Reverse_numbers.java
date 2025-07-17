package JAVA;

import java.util.Scanner;

class Reverse_numbers {

    public static void Reverse(int n) {
        int rev = 0; 
        while (n > 0) {
            int lastdigit = n % 10; 
            rev = rev * 10 + lastdigit; 
            n = n / 10;
        }
        System.out.println("Reversed number: " + rev); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Provide the number to be reversed: ");
        int n = sc.nextInt(); 
        Reverse(n); 
        sc.close(); 
    }
}