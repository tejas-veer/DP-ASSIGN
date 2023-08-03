package solid.live.dip;

public class FileReader implements Reader{
    String path;
    public FileReader(String path){
        this.path = path;
    }

    @Override
    public String read() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }
    
}
