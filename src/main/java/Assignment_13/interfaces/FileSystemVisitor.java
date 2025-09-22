package Assignment_13.interfaces;

import Assignment_13.Directory;
import Assignment_13.File;

public interface FileSystemVisitor {
    void visit(File file);

    void visit(Directory directory);
}