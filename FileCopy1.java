import java.io.*;

public class FileCopy1 {
    public static void main(String[] args) {
        FileInputStream fr = null;
        FileOutputStream fc = null;
        try {
            fr = new FileInputStream("test1.txt");
            fc = new FileOutputStream("test3.txt");
            int c;
            do {
                c = fr.read();
                if (c != -1) {
                    fc.write((char) c);
                    System.out.print((char) c);
                }
            } while (c != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File not found\nException: " + e);
        } catch (IOException e) {
            System.out.println("Error occurred while closing\nException: " + e);
        } finally {
            try {
                if (fr != null)
                    fr.close();
                if (fc != null)
                    fc.close();
            } catch (IOException e) {
                System.out.println("Error closing streams\nException: " + e);
            }
        }
    }
}
 