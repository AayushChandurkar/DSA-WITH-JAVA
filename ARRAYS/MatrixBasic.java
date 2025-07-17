package JAVA;
import java.util.*;

public class MatrixBasic {
    
    

    public static void main (String[] args){
        int n = 3,m = 3;
        Scanner sc = new Scanner(System.in);
        int matrix [][]= new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++ ){
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");

    }
}
}