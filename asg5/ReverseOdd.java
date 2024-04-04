public class ReverseOdd {
    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static String reverseOdd(String str) {
        String[] wordsArray = str.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (String word : wordsArray) {
            if (isOdd(word.length())) {
                reversedString.append(new StringBuilder(word).reverse().toString()).append(" ");
            } else {
                reversedString.append(word).append(" ");
            }
        }
        return reversedString.toString().trim(); // Remove trailing space
    }

    public static void main(String[] args) {
        System.out.println(reverseOdd("Bananas"));
        System.out.println(reverseOdd("One two three four"));
        System.out.println(reverseOdd("Make sure uoy only esrever sdrow of ddo length"));
    }
}
