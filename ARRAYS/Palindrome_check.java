package JAVA;
import java.util.Scanner;

public class Palindrome_check {


    public static void Palindrome(int n){
        int original = n;
        int rev = 0;
        while(n>0){
            int lastdigit = n%10;
            rev = rev*10 + lastdigit;
            n=n/10;
        }
        System.out.println("The reverse of the number is: "+rev);
        
        if(original==rev){
            System.out.println("This is a palindrome number");
        }
        else{
            System.out.println("This is not a palindrome");
        }

    }


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to be checked");
        int n = sc.nextInt();
        Palindrome(n);
        sc.close();
        System.out.println("hence it is checked if the given number is a palindrome or nott");
    }
    
}
