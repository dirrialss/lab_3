package work3;
/**
 * Component interface.
 * The FileSystemElement interface represents a common interface for elements in the file system, which can be either files or folders.
 * This interface defines a method for displaying the structure ofthe file system in a hierarchical format.
 */
public interface FileSystemElement {
    /**
     * Displays the element with the specified indentation for hierarchy.
     *
     * @param indent The indentation for formatting the display.
     */
    void display(String indent);
}
