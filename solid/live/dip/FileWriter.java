package solid.live.dip;

public class FileWriter implements Writer{
    String path;
    public FileWriter(String path){
        this.path = path;
    }

    @Override
    public void write(String data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'write'");
    }
    
}
