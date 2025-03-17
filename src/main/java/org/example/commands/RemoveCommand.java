package org.example.commands;

import org.example.receiver.TaskManager;

public class RemoveCommand extends Invoker {

    public RemoveCommand(TaskManager taskManager) {
        super(taskManager);
    }

    @Override
    public boolean execute() {
        System.out.println("Removing task");
        return false;
    }

}