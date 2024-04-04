import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ToArray {
    public static List<String[]> toArray(Map<String, Object> obj) {
        if (obj.isEmpty()) {
            return new ArrayList<>();
        }

        List<String[]> keyValuePairs = new ArrayList<>();
        for (Map.Entry<String, Object> entry : obj.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            keyValuePairs.add(new String[] { key, value.toString() }); // Convert value to string
        }
        return keyValuePairs;
    }

    public static void main(String[] args) {
        Map<String, Object> emptyMap = new java.util.HashMap<>();
        Map<String, Object> mapWithValues = new java.util.HashMap<>();
        mapWithValues.put("a", 1);
        mapWithValues.put("b", 2);

        System.out.println(toArray(emptyMap));
        System.out.println(toArray(mapWithValues));
    }
}
