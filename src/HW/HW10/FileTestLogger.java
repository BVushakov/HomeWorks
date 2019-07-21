package HW.HW10;

import java.io.*;
import java.util.Calendar;
import java.util.Date;

public class FileTestLogger extends TestLogger {

    @Override
    public String log(String message) {
        return getTime() + " " + message;
    }

    public static Date getTime() {
        return Calendar.getInstance().getTime();
    }

    public static void createFile(String log) {
        File myFile = new File("Info about age.txt");
        if (!myFile.exists()) {
            try {
                myFile.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer.println(log);

            writer.close();
        }catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
