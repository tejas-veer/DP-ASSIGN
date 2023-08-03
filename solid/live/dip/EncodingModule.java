package solid.live.dip;



import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModule {

    Reader reader;
    Writer writer;
    Encoder encoder;

    public EncodingModule(Reader reader,Encoder encoder,Writer writer){
        this.reader = reader;
        this.encoder = encoder;
        this.writer = writer;
    }

    public void encodeAndWrite() {
        String data = reader.read();
        String encodedData = encoder.encode(data);
        writer.write(encodedData);
    }

   
}

