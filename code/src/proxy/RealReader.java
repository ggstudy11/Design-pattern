package proxy;

import java.io.Reader;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 2:47 PM
 * @description：
 * @modified By：
 */
public class RealReader implements FileReader {
    @Override
    public void readFile(String filename) {
        System.out.println("Reading file: " + filename);
    }

    @Override
    public void getFileLength() {
        System.out.println("length: " + 10);
    }
}
