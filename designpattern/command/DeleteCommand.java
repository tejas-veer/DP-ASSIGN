import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteCommand implements Command {
    private final String fileName;

    public DeleteCommand(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        File file = new File(fileName);
        file.delete();
    }

    @Override
    public void undo() {
    }
}
