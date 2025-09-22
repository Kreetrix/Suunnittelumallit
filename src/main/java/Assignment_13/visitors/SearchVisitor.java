package Assignment_13.visitors;

import java.util.ArrayList;
import java.util.List;

import Assignment_13.Directory;
import Assignment_13.File;
import Assignment_13.interfaces.FileSystemVisitor;

public class SearchVisitor implements FileSystemVisitor {
    private String keyword;
    private List<File> matchingFiles = new ArrayList<>();

    public SearchVisitor(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(keyword)) {
            matchingFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        // nothing special needed for directory itself
    }

    public List<File> getMatchingFiles() {
        return matchingFiles;
    }
}
