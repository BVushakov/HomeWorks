package HW.HW8;


public class TestBrowser {

    public void create() {
        switch (ConfigurationManager.getInstance().getBrowser()) {
            case "chrome":
                System.out.println("Test browser in chrome");
                break;
            case "firefox":
                System.out.println("Test browser in firefox");
                break;
            default:
                System.out.println("Test browser is undefined");
        }
    }
}
