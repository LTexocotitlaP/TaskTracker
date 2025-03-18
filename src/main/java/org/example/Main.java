package org.example;

import org.example.history.TaskHistory;
import org.example.tasks.Progress;
import org.example.tasks.Tasks;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        Tasks tasks = new Tasks(1, "Todo", "Making the app", Progress.IN_PROGRESS);
        TaskHistory tk = TaskHistory.getInstance();
        try {
            FileWriter fw = new FileWriter(TaskHistory.getInstance().historyFile);
            fw.write(tasks.toString());
            fw.close();
            System.out.println("written to file");
        } catch (Exception e) {
            e.printStackTrace();
        }

        tk.formatJSONFile(tk.historyFile);

        System.out.println(tasks.toString());
    }
}
