
package opennotepad;
import java.io.*;

/**
 *
 * @author Pundo
 */
public class OpenNotepad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Runtime rs = Runtime.getRuntime();
       rs.exec("notepad");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
