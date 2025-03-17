package org.example.commands;

import org.example.receiver.TaskManager;

public class ListCommand extends Invoker {

    public ListCommand(TaskManager taskManager) {
        super(taskManager);
    }

    @Override
    public boolean execute() {
        System.out.println("Listing tasks");
        return false;
    }


}