package work3;
/**
 * The main method that runs the application.
 * <p>
 * It demonstrates the creation of files and folders and how they can be organized hierarchically.
 * </p>
 * @author Siukalo Diana
 */
public class Main {
    /**
     * The main method initializes a file system structure and displays its contents.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        File file1 = new File("text1.txt");
        File file2 = new File("text2.txt");
        File file3 = new File("text3.txt");
        Folder general = new Folder("General");
        Folder folder1 = new Folder("Folder-1");
        general.add(file1);
        general.add(file2);
        general.add(folder1);
        folder1.add(file3);
        general.display("");
    }
}