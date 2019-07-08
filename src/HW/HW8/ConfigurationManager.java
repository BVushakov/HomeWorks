package HW.HW8;


public class ConfigurationManager {
    public static ConfigurationManager instance;

    private String browser = "chrome";
    private String testenv = "local";

    private ConfigurationManager() {

    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            return instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getBrowser () {
        return System.getProperty("browser", browser);
    }

    public String getTestenv () {
        return System.getProperty("testenv", testenv);
    }
}
