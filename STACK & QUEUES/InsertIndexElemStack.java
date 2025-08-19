package JAVA;
import java.util.*;

public class InsertAtAnyIndexStack {
    public static void InsertElement(Stack<Integer> st, Stack<Integer> ans, int n, int v ){
        int size = st.size();
        System.out.println("Original stack is : " + st);

        if(n == size){ 
            st.push(v);
            System.out.println(st);
        }
        else if(n == 0){ 
            for(int i = 0; i < size; i++){  
                ans.push(st.pop());
            }
            st.push(v);  
            for(int i = 0; i < size; i++){   
                st.push(ans.pop());
            }
            System.out.println(st);
        }
        else{ 
            
            for(int i = 0; i < size - n; i++){  
                ans.push(st.pop());
            }
            st.push(v);  
            for(int i = 0; i < size - n; i++){  
                st.push(ans.pop());
            }
            System.out.println(st);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index to enter the element : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of the element : ");
        int v = sc.nextInt();

        InsertElement(st, ans, n, v);
    }
}

