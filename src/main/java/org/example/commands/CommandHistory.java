package org.example.commands;

import java.util.Stack;

public class CommandHistory {
    private Stack<Invoker> history = new Stack<Invoker>();

    public void push(Invoker c) {
        history.push(c);
    }

    public Invoker pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}