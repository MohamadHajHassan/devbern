public class OddishOrEvenish {

    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static int sumOfDigitsRecursive(int n) {
        if (n < 10) {
            return n;
        } else {
            return (n % 10) + sumOfDigitsRecursive(n / 10);
        }
    }

    public static String oddishOrEvenish(int n) {
        return isOdd(sumOfDigitsRecursive(n)) ? "Oddish" : "Evenish";
    }

    public static void main(String[] args) {
        System.out.println(oddishOrEvenish(121));
        System.out.println(oddishOrEvenish(41));
    }
}
