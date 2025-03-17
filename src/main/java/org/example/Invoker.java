package org.example;

public abstract class Invoker {
    public TaskManager taskManager;

    Invoker(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    public abstract boolean execute();
}