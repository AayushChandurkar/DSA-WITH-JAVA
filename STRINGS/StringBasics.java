package JAVA;

public class StringBasics {
    public static void main(String[] args) {
        String str = "Aayush";
        char target = 'u';

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)==target){
                System.out.println("Target found at index " + i);
            }
        }
    }
    
}
