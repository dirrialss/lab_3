package work3;
import java.util.ArrayList;
import java.util.List;
/**
 * Composite component class.
 * Represents a folder in the file system, which can contain files and other folders. This class implements the
 * FileSystemElement interface and acts as a composite component in a hierarchical file system structure.
 */

public class Folder implements FileSystemElement {
    /**
     * The name of the folder.
     */
    private final String name;
    /**
     * List of files and subdirectories.
     */
    private final List<FileSystemElement> childComponents = new ArrayList<>();
    /**
     * Folder constructor
     * Constructs a Folder with the specified name.
     * @param name The name of the folder.
     */
    public Folder(String name) {
        this.name = name;
    }
    /**
     * Adds a child component (file or folder) to this folder.
     * @param item The FileSystemElement to be added as a child.
     */
    public void add(FileSystemElement item) {
        childComponents.add(item);
    }
    /**
     * Removes a specified child component from this folder.
     *
     * @param element The FileSystemElement to be removed from the folder.
     */
    public void removeElement(FileSystemElement element) {
        childComponents.remove(element);
    }
    /**
     * Displays the folder name along with its contents,
     * indenting the display based on the folder's hierarchy level.
     * @param indent The indentation used for formatting the display.
     * This helps visualize the folder structure.
     */
    @Override
    public void display(String indent) {
        System.out.println(indent + "Folder: " + name);
        for (FileSystemElement item : childComponents) {
            item.display(indent + "  ");
        }
    }
}
