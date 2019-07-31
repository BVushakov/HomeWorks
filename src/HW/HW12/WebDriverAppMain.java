package HW.HW12;

public class WebDriverAppMain {
    public static void main(String[] args) {
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        IDriver driver = webDriverFactory.create();

        driver.open("https://www.google.ru/");
        driver.sendKeys("hillel");
        driver.click();
    }
}
