package HW.HW13;

import HW.HW13.my.webdrivers.ChromeDriver;
import HW.HW13.my.webdrivers.OperaDriver;
import HW.HW13.my.webdrivers.SafariDriver;

public class WebDriverFactory implements IFactory {
    @Override
    public IDriver create() {
        IDriver driver = null;

        String browserConfig = ConfigurationManager.getInstance().getBrowser();
        BrowserList browser = BrowserList.valueOf(browserConfig.toUpperCase());


        switch (browser) {
            case CHROME:
                driver = new ChromeDriver();
                break;
            case SAFARI:
                driver = new SafariDriver();
                break;
            case OPERA:
                driver = new OperaDriver();
                break;
            default:
                System.out.println(browser.name() + " can`t be used!");
        }

        return driver;
    }
}
