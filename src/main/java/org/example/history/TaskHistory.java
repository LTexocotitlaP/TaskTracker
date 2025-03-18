package org.example.history;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskHistory {

    private static TaskHistory taskHistory;
    public File historyFile;

    private TaskHistory(String pathName) {
        this.historyFile = new File(pathName);
    }

    public static TaskHistory getInstance() {
        if (taskHistory == null) {
            taskHistory = new TaskHistory(System.getProperty("user.dir")+"\\\\.history.json");
        }
        return taskHistory;
    }

    public File formatJSONFile (File file) {
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNext()) {
                String data = String.valueOf(myReader.delimiter());
                System.out.println(data);
                System.out.println();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return file;
    }
}