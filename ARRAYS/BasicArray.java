package ARRAYS;
public class BasicArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // Print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Update
        arr[2] = 100;

        System.out.println("\nAfter update:");

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
