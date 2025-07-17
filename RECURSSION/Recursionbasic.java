package JAVA;
/* 
public class Recursionbasic {
    public static void printasc(int n, int num){

        if(num == n+1){
            return;
        }
        System.out.println(num);
        printasc(n,num+1);

    }



    public static void main(String[] args) {
        int n = 5;
        
        printasc(n,1);

    }
}
*/
public class Recursionbasic {
    public static void printasc(int n, int m){
        if(n<=m){
            if(n == m){
                System.out.println(n);
                return;
            }
            System.out.println(n);
            printasc(n+1,m);
        }
        if(n>=m){
            if(n == m){
                System.out.println(n);
                return;
            }
            System.out.println(n);
            printasc(n-1,m);
        }
    }



    public static void main(String[] args) {
        int n = 14;
        int m = 10;
        
        printasc(n,m);

    }
}
