import java.util.Arrays;
import java.util.ArrayList;

public class RemoveMiddleElements {
    public static String[] removeSecondElementFromArray(String[] arr) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        list.remove(1);
        return list.toArray(new String[0]);
    }

    public static String[] removeNthElementFromArray(String[] arr, int n) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        list.remove(n - 1);
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {

        String[] array = { "A", "B", "C", "D", "E", "F", "G", "H" };

        String[] arrayWithoutSecondElement = removeSecondElementFromArray(Arrays.copyOf(array, array.length));
        String[] arrayWithoutFirstElement = removeNthElementFromArray(Arrays.copyOf(array, array.length), 1);
        String[] arrayWithoutThirdElement = removeNthElementFromArray(Arrays.copyOf(array, array.length), 3);
        String[] arrayWithoutEighthElement = removeNthElementFromArray(Arrays.copyOf(array, array.length), 8);

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("After removing second element: " + Arrays.toString(arrayWithoutSecondElement));
        System.out.println("After removing third element: " + Arrays.toString(arrayWithoutThirdElement));
        System.out.println("After removing first element: " + Arrays.toString(arrayWithoutFirstElement));
        System.out.println("After removing eighth element: " + Arrays.toString(arrayWithoutEighthElement));
    }
}