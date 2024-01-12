package Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class loaddataproperties {
    public static Properties UserData =
            loaddataproperties(System.getProperty("user.dir") + "\\Properties\\testdata.properties");



    private static Properties loaddataproperties(String path) {
        Properties obj = new Properties();
        FileInputStream stream = null;
        try {
            stream = new FileInputStream(path);

            obj.load(stream);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return obj;
    }
}
