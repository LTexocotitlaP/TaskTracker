package org.example.commands;

import org.example.receiver.TaskManager;

public abstract class Invoker {
    public TaskManager taskManager;

    Invoker(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    public abstract boolean execute();
}