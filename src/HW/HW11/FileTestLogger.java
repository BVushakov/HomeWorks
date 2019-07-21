package HW.HW11;

import java.io.*;
import java.util.Date;
import java.util.Calendar;

public class FileTestLogger implements ITestLogger {

    @Override
    public String log(String message) {
        return getTime() + " " + message;
    }

    public static Date getTime() {
        return Calendar.getInstance().getTime();
    }

    public static void createFile(String log) {
        File myFile = new File("Age_logs.txt");
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

