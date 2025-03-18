package org.example.receiver;

import java.util.ArrayList;
import java.util.Arrays;

import org.example.commands.*;

public class TaskManager {

    ArrayList<String> tasks = new ArrayList<String>();
    TaskManager taskManager = this;
    private CommandHistory history = new CommandHistory();

    public TaskManager(String[] args) {
        tasks.addAll(Arrays.asList(args));
        for (String task : tasks) {
            switch (task) {
                case "add":
                    execute(new AddCommand(taskManager));
                    break;
                case "list":
                    execute(new ListCommand(taskManager));
                    break;
                case "delete":
                    execute(new RemoveCommand(taskManager));
                    break;
                    default:
                        System.out.println("Unknown task: " + task);
                        break;
            }
        }
    }

    public void execute(Invoker invoker) {
        if(invoker.execute()) {
            history.push(invoker);
        }
    }

}