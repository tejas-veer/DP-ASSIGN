package net.media.training.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    private List<Command> commandList = new ArrayList<>();

    public void executeCommand(Command command) {
        commandList.add(command);
        try {
            command.execute();
        } catch (Exception e) {
            // Handle the exception if needed
            e.printStackTrace();
        }
    }

    public void undoCommands() {
        for (int i = commandList.size() - 1; i >= 0; i--) {
            Command command = commandList.get(i);
            try {
                command.undo();
            } catch (Exception e) {
                // Handle the exception if needed
                e.printStackTrace();
            }
        }
        commandList.clear();
    }
}