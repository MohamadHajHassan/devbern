import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GetHashTags {
    public static String removeNonLettersAndSpaces(String str) {
        return str.replaceAll("[^a-zA-Z ]", "");
    }

    public static List<String> getTopThreeLongestWords(String str) {
        String[] wordsArray = str.split(" ");
        return Arrays.stream(wordsArray)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static List<String> getHashTags(String str) {
        String strWithoutPunctuation = removeNonLettersAndSpaces(str);
        List<String> topThreeLongestWords = getTopThreeLongestWords(strWithoutPunctuation);
        return topThreeLongestWords.stream()
                .map(word -> "#" + word)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(getHashTags(
                "How the Avocado Became the Fruit of the Global Trade"));
        System.out.println(getHashTags(
                "Why You Will Probably Pay More for Your Christmas Tree This Year"));
        System.out.println(getHashTags("Visualizing Science"));
    }
}
