package org.example;

public class ListCommand extends Invoker {

    public ListCommand(TaskManager taskManager) {
        super(taskManager);
    }

    @Override
    public boolean execute() {
        return false;
    }

}