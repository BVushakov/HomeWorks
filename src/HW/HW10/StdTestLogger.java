package HW.HW10;

import java.util.Calendar;
import java.util.Date;

public class StdTestLogger extends TestLogger {

    @Override
    public String log(String message) {
            System.out.println("LOG IN CONSOLE: " + getTime() + ": " + message);
        return message;
    }



    public static Date getTime() {
        return Calendar.getInstance().getTime();
    }
}
