package Assignment_5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private String path = "src/main/java/Assignment_5/";
    private String fileName = path + "Log.txt";
    private FileWriter myWriter;

    private Logger() {
        this.createFile();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    private void createFile() {
        try {
            File file = new File(this.fileName);
            file.createNewFile();
            this.myWriter = new FileWriter(this.fileName);
        } catch (IOException e) {
            System.out.println("An error with createFile");
            e.printStackTrace();
        }
    }

    public Logger setFileName(String name) {
        this.close();
        this.fileName = path + name + ".txt";
        instance = new Logger();
        this.createFile();
        return instance;
    }

    public void write(String logText) {
        try {
            this.myWriter.write(logText + "\n");
        } catch (IOException e) {
            System.out.println("An error with write");
            e.printStackTrace();
        }
    }

    public void close() {
        if (this.myWriter != null) {
            try {
                this.myWriter.close();
            } catch (IOException e) {
                System.out.println("An error with close");
                e.printStackTrace();
            }
        }
    }
}
