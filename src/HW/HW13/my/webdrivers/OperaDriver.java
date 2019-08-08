package HW.HW13.my.webdrivers;

import HW.HW13.IDriver;

public class OperaDriver implements IDriver {
    @Override
    public void open(String url) {
        System.out.println("Opera opened url " + url);
    }

    @Override
    public void click() {
        System.out.println("Opera clicked on element");
    }

    @Override
    public void sendKeys(String sendKeys) {
        System.out.println("Opera sendKeys " + sendKeys);
    }
}
