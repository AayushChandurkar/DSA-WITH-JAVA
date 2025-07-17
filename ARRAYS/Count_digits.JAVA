import java.util.*;

class Count_digits {
    
    
    public static void Count(Float n) {
        int count = 0;
        while (n > 0) {
            count = count + 1; 
            n = n / 10;
        }
        System.out.println("Number of digits: " + count); 
    }

    
    
    public static void Count_efficient(Float n){
        int count = (int)(Math.log10(n)+1);
        System.out.println("Number of digits: " + count);
        return;
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        Float n = sc.nextFloat(); 
        Count(n);
        Count_efficient(n);
        sc.close(); 
    }
}