package HW.HW13.my.environment;

import HW.HW13.IEnvironment;

public class RemoteEnv implements IEnvironment {

    @Override
    public void getInfo() {
        System.out.println("You are using Remote Environment");
    }
}
