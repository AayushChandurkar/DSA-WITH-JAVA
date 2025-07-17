package JAVA;

    class LeaderElements {

    public static void leader(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
            if (count == arr.length - i) {
                System.out.println("The Leader element is : " + arr[i]);
            }
        }
        System.out.println("The Leader element is : " + arr[arr.length - 1]);

    }

    public static void main(String[] args) {
        int arr[] = { 30, 5, 10, 11, 9, 0 };
        leader(arr);
    }
}
