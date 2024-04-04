public class LuckyNumber {
    public static boolean containsSevenRecursive(int n) {
        if (n % 10 < 10) {
            return n % 10 == 7;
        } else {
            return containsSevenRecursive(n / 10);
        }
    }

    public static String luckyNumber(int[] arr) {
        for (int element : arr) {
            if (containsSevenRecursive(element)) {
                return "LUCKY!";
            }
        }
        return "There is no 7 in the array!";
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr2 = { 8, 6, 33, 100 };
        int[] arr3 = { 2, 55, 60, 97, 86 };

        System.out.println(luckyNumber(arr1));
        System.out.println(luckyNumber(arr2));
        System.out.println(luckyNumber(arr3));
    }
}
