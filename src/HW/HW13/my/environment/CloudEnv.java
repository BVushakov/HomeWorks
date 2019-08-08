package HW.HW13.my.environment;

import HW.HW13.IEnvironment;

public class CloudEnv implements IEnvironment {

    @Override
    public void getInfo() {
        System.out.println("You are using Cloud Environment");
    }
}
