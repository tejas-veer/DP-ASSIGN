import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class MoveCommand implements Command {
    private final String source;
    private final String destination;

    public MoveCommand(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public void execute() throws RuntimeException {
        File file = new File(source);
        if (!file.exists())
            throw new RuntimeException("File does not exist");
        if (!file.renameTo(new File(destination)))
            throw new RuntimeException("Rename failed");
    }

    @Override
    public void undo() {
        // Move the file back to the original location
    }
}