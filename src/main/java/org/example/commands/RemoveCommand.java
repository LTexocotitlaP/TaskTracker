package org.example.commands;

import org.example.tasks.TaskManager;

public class RemoveCommand extends Invoker {

    //
    public RemoveCommand(TaskManager taskManager) {
        super(taskManager);
    }

    //
    @Override
    public boolean execute() {

        return false;
    }

}