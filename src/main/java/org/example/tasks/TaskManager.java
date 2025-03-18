package org.example.tasks;

import org.example.commands.CommandHistory;
import org.example.commands.Invoker;

import java.util.ArrayList;

public class TaskManager {

    //
    ArrayList<Tasks> tasks = new ArrayList<Tasks>();
    TaskManager taskManager = this;
    private CommandHistory commandHistory = new CommandHistory();

    public TaskManager(String[] args) {



    }

    //
    public void execute(Invoker invoker) {
        if (invoker.execute()) {
            commandHistory.push(invoker);
        }
    }
}