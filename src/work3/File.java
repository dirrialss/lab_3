package work3;
/**
 * Leaf component class.
 * Represents a file in the file system,implementing the FileSystemElement interface.
 * This class serves as a leaf component in the file system structure.
 */
public class File implements FileSystemElement {
    /**
     * The name of the file.
     */
    private final String name;
    /**
     * File constructor.
     * Constructs a File with the specified name.
     * @param name The name of the file.
     */
    public File(String name) {
        this.name = name;
    }
    /**
     * Displays the file name with the specified indentation.
     * @param indent The indentation used for formatting the display.
     * This helps visualize the file's position in the file system structure.
     */
    @Override
    public void display(String indent) {
        System.out.println(indent + "File: " + name);
    }
}
