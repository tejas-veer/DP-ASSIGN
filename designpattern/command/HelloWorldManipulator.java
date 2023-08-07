package net.media.training.designpattern.command;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 20, 2011
 * Time: 4:55:07 PM
 * To change this template use File | Settings | File Templates.
 */

   
public class HelloWorldManipulator {
    private final CommandInvoker commandInvoker = new CommandInvoker();

    public void manipulate(final String fileName, final String newPath) {
        try {
            Command createCommand = new CreateCommand(fileName, "hello world");
            Command updateCommand = new UpdateCommand(fileName, "new hello world");
            Command moveCommand = new MoveCommand(fileName, newPath);

            commandInvoker.executeCommand(createCommand);
            commandInvoker.executeCommand(updateCommand);
            commandInvoker.executeCommand(moveCommand);
        } catch (Exception e) {
            commandInvoker.undoCommands();
        }
    }
}