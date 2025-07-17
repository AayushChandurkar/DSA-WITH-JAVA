package JAVA;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "Mom OM".toLowerCase().replaceAll("\\s+","");
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                count++;
            } 
            else {
                System.out.println("It is not a palindrome");
                break;
            }

        }
        if (count == str.length()){

            System.out.println("It is a palindrome :)");
        }
    }
}
