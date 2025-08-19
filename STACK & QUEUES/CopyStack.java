package JAVA;
import java.util.*;
class CopyStack{

    public static void reverseOrder(Stack<Integer> st,Stack<Integer> rt,Stack<Integer> ct){
        while(st.size()>0){
            int x = st.peek();
            rt.push(x);
            st.pop();
        }
        System.out.println("The reversed stack is : ");
        System.out.println(rt);
        System.out.println("The copied stack is : ");
        while(rt.size()>0){
            ct.push(rt.pop());
        }
        System.out.println(ct);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new  Stack<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in stack : ");
        n = sc.nextInt();
        
        for(int i = 0; i <= n-1; i++){
            System.out.println("Enter the element number "+(i+1));
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        Stack<Integer> rt = new  Stack<>();
        Stack<Integer> ct = new  Stack<>();
        reverseOrder(st, rt,ct);
    }
