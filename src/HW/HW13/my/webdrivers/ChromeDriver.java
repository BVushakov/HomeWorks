package HW.HW13.my.webdrivers;

import HW.HW13.IDriver;

public class ChromeDriver implements IDriver {
    @Override
    public void open(String url) {
        System.out.println("Chrome opened url " + url);
    }

    @Override
    public void click() {
        System.out.println("Chrome clicked on element");
    }

    @Override
    public void sendKeys(String sendKeys) {
        System.out.println("Chrome sendKeys " + sendKeys);
    }
}
