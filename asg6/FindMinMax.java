package devbern.asg6;

public class FindMinMax {

    public static void findMinMax(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty!");
            return;
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);
    }

    public static void main(String[] args) {
        int[] numbers = { 15, 5, 68, 64, 2, 8, 9 };
        findMinMax(numbers);
    }
}
