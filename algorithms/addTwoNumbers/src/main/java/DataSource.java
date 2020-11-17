import org.yaml.snakeyaml.Yaml;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;

/**
 * inzheneher created on 16/11/2020 inside the package - PACKAGE_NAME
 */
public final class DataSource {
    private static final String DATA_PATH = "algorithms/addTwoNumbers/src/main/resources/data.yaml";
    public static Map<String, ArrayList<Integer>> getResourceFromYaml() {
        Yaml yaml = new Yaml();
        BufferedInputStream stream = null;
        try {
            stream = new BufferedInputStream(new FileInputStream(DATA_PATH));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return yaml.load(stream);
    }
}
