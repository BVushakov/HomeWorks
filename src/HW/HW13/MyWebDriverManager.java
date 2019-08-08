package HW.HW13;

import HW.HW13.my.environment.LocalEnv;
import HW.HW13.my.environment.RemoteEnv;
import HW.HW13.my.environment.CloudEnv;

public class MyWebDriverManager {

    public IEnvironment showEnv () {

        IEnvironment factory = null;

        String envConfig = ConfigurationManager.getInstance().getTestEnv();
        EnvList environment = EnvList.valueOf(envConfig.toUpperCase());


        switch (environment) {
            case LOCAL:
                factory = new LocalEnv();
                break;
            case CLOUD:
                factory = new RemoteEnv();
                break;
            case REMOTE:
                factory = new CloudEnv();
                break;
            default:
                System.out.println(environment.name() + " - not supported!");
        }

        return factory;
    }
}
