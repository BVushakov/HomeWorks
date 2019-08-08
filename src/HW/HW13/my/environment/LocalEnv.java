package HW.HW13.my.environment;

import HW.HW13.IEnvironment;

public class LocalEnv implements IEnvironment {

    @Override
    public void getInfo() {
        System.out.println("You are using Local Environment");
    }
}
