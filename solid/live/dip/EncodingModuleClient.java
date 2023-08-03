package solid.live.dip;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {

    public static void main(String[] args) throws IOException {
       EncodingModule encodingModule  = new EncodingModule(
            new FileReader("C:/Users/tejas.ko/Downloads/Solid all five/Solid all five/src/solid/live/dip/beforeEncryption.txt"),
            new Base64Encoder(),
            new DatabaseWriter()
       );

       encodingModule.encodeAndWrite();

       EncodingModule encodingModule2  = new EncodingModule(
            new UrlReader("http:/s/s/s/s"),
            new Base64Encoder(),
            new FileWriter("C:/Users/tejas.ko/Downloads/Solid all five/Solid all five/src/solid/live/dip/afterEncryption.txt")
       );

       encodingModule2.encodeAndWrite();

}
}
