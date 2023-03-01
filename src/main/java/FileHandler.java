import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileHandler {
    public static HashMap<String, String> getMapOfProperties() {
        Properties properties = new Properties();
        HashMap<String, String> mapOfProperties = new HashMap<>();
        try (InputStream input = new FileInputStream("src/main/resources/test.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            mapOfProperties.put((String) entry.getKey(), (String) entry.getValue());
        }
        return mapOfProperties;
    }
}
