package JAVA;
public class RepeatingNmissing {

    public static void RNM(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int count = 1;
            int var = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    var = j;
                }
            }
            if (count > 1) {
                System.out.println("The repeated number is : " + arr[i]);
                System.out.println("The missing number is : " + (var + 1));
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = {3,1,2,5,4,6,7,5};
        RNM(arr);
    }
}
