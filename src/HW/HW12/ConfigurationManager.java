package HW.HW12;

public class ConfigurationManager {

    private static ConfigurationManager instance;
    private String browser = "chrome";


    private ConfigurationManager() {

    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            return instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getBrowser() {
        return System.getProperty("browser".toLowerCase(), browser.toLowerCase());
    }
}
