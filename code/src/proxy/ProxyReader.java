package proxy;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 2:48 PM
 * @description：
 * @modified By：
 */
public class ProxyReader implements FileReader{
    private FileReader reader;

    public ProxyReader(FileReader reader) {
        this.reader = reader;
    }

    @Override
    public void readFile(String filename) {
        System.out.println("校验...");
        reader.readFile(filename);
    }

    @Override
    public void getFileLength() {
        System.out.println("校验...");
        reader.getFileLength();
    }
}
