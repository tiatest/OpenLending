import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {
        String path = "Configuration.properties";

        try {
            FileInputStream file = new FileInputStream(path);
            properties= new Properties();
            properties.load(file);
            file.close();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Path :"+path+" not found");
        }

    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }


}
