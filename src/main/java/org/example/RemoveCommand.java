package org.example;

public class RemoveCommand extends Invoker {

    public RemoveCommand(TaskManager taskManager) {
        super(taskManager);
    }

    @Override
    public boolean execute() {
        return false;
    }

}