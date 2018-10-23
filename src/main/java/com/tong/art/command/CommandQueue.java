package com.tong.art.command;

import java.util.ArrayList;

public class CommandQueue {
    private ArrayList<Command> commands = new ArrayList<Command>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    public void execute() {
        for (Object command : commands) {
            ((Command) command).execute();
        }
    }
}
