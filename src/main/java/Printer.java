import java.util.Arrays;
import java.util.Map;

public class Printer {
    public static void printMapOfProperties(Map<String, String> propertiesToPrint, String[] sensitiveKeys) {
        propertiesToPrint.entrySet().stream()
                .map(entry -> {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (Arrays.asList(sensitiveKeys).contains(key)) {
                        value = "******";
                    }
                    return key + " = " + value;
                })
                .forEach(System.out::println);
    }
}
