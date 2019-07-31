package HW.HW12.myWebDrivers;

import HW.HW12.IDriver;

public class SafariDriver implements IDriver {
    @Override
    public void open(String url) {
        System.out.println("Safari opened url " + url);
    }

    @Override
    public void click() {
        System.out.println("Safari clicked on element");
    }

    @Override
    public void sendKeys(String sendKeys) {
        System.out.println("Safari sendKeys " + sendKeys);
    }
}
