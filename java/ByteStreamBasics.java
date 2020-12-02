/**
 * Simple example of using Java's FileInputStream an FileOutputStream to copy the contents
 * of a file named input.txt to a file named output.txt
 *
 * @author https://github.com/theeastcoastwest
 * @since 12/2/2020
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BasicByteStreams {

    /**
     * Creates a FileInputStream + FileOutputStream object, reads in a file named input.txt
     * and copies the contents to a file named output.txt
     * @param args void
     * @throws IOException if input.txt file not found.
     */
    public static void main(String[] args) throws IOException {

        // Define I/O streams
        FileInputStream inStream;
        FileOutputStream outStream;

        // Get input stream
        inStream = new FileInputStream("input.txt");

        // Get output Stream
        outStream = new FileOutputStream("output.txt");

        // Stream input, write to output
        int next;  // the next character in the byte stream
        while((next = inStream.read()) != -1){

            // Write next character
            outStream.write(next);
        }
    }
}
