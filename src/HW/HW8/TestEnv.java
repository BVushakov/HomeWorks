package HW.HW8;


public class TestEnv {
    public void create() {
        switch (ConfigurationManager.getInstance().getTestenv()) {
            case "local":
                System.out.println("Test env is local");
                break;
            case "dev":
                System.out.println("Test browser is dev");
                break;
            default:
                System.err.println("Test env no set");
        }
    }
}