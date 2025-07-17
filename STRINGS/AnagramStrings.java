package JAVA;

public class AnagramStrings {
    public static void main(String[] args) {
        String str1 = "7893U".toLowerCase();
        String str2 = "7893U".toLowerCase();
        int count = 0;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        count++;
                    }
                }

            }
            System.out.println(count);
            System.out.println(str1.length());
            int n = str1.length();

            if (count == n || count > n) {
                System.out.println("The Strings are Anagrams :)");

            } else {
                System.out.println("The Strings are not Anagrams :(");

            }
        }

        else {
            System.out.println("The strings are not anagrams");
        }
    }
}
