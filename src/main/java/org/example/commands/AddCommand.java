package org.example.commands;

import org.example.tasks.TaskManager;

public class AddCommand extends Invoker {

    //
    public AddCommand(TaskManager taskManager) {
        super(taskManager);
    }

    //
    @Override
    public boolean execute() {
        System.out.println("Adding task");
        return false;
    }

}