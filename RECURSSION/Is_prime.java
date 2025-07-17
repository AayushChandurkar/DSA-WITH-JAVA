package JAVA;
import java.util.*;
public class Is_prime {

    public static void prime(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count = count+1;                
            }
        }
        if(count == 2){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
           
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is prime:  ");
        int n = sc.nextInt();
        prime(n);
        sc.close();


    }
}
