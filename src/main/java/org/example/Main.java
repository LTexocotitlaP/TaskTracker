package org.example;

public class Main {

    public class TaskManager {

    }

    public abstract class Invoker {
        public TaskManager taskManager;

        Invoker(TaskManager taskManager) {
            this.taskManager = taskManager;
        }

        public abstract boolean execute();
    }

    public class AddCommand extends Invoker {

        public AddCommand(TaskManager taskManager) {
            super(taskManager);
        }

        @Override
        public boolean execute() {
            return false;
        }

    }

    public class RemoveCommand extends Invoker {

        public RemoveCommand(TaskManager taskManager) {
            super(taskManager);
        }

        @Override
        public boolean execute() {
            return false;
        }

    }

    public class ListCommand extends Invoker {

        public ListCommand(TaskManager taskManager) {
            super(taskManager);
        }

        @Override
        public boolean execute() {
            return false;
        }

    }

    public static void main(String[] args) {

    }
}
