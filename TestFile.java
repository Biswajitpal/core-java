import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        System.out.println("This is a file.");
        File file = new File("test.txt");
        try {
            file.createNewFile();
            System.out.println("File created: " + file.getName());
            System.out.println("File can be written to: " + file.canWrite());
            System.out.println("File path: " + file.getPath());
            System.out.println("File absolute path: " + file.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("An error occurred." + e.getMessage());
            e.printStackTrace();
        }
    }
}
