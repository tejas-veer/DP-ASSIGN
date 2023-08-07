public class CreateCommand implements Command {
    private final String fileName;
    private final String content;

    public CreateCommand(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }

    @Override
    public void execute() throws IOException {
        File file = new File(fileName);
        if (file.exists())
            throw new RuntimeException("File already exists");
        file.createNewFile();
        PrintWriter writer = new PrintWriter(file);
        writer.write(content);
        writer.close();
    }

    @Override
    public void undo() {
        File file = new File(fileName);
        file.delete();
    }
}