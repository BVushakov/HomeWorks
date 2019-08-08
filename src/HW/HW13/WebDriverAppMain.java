package HW.HW13;

public class WebDriverAppMain {
    public static void main(String[] args) {
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        IDriver driver = webDriverFactory.create();

        MyWebDriverManager webDriverManager = new MyWebDriverManager();
        IEnvironment factory = webDriverManager.showEnv();

        driver.open("https://www.google.ru/");
        driver.sendKeys("hillel");
        driver.click();

        factory.getInfo();


    }
}
