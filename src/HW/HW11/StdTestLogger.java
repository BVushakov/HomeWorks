package HW.HW11;

import java.util.Date;
import java.util.Calendar;

public class StdTestLogger implements ITestLogger  {

    @Override
    public String log(String message) {
            System.out.println("LOG IN CONSOLE: " + getTime() + ": " + message);
        return "LOG IN CONSOLE: " + getTime() + ": " + message;
//        return message;
    }



    public static Date getTime() {
        return Calendar.getInstance().getTime();
    }
}
