package Assignment_13;

import Assignment_13.visitors.SearchVisitor;
import Assignment_13.visitors.SizeCalculatorVisitor;

public class Main {
    public static void main(String[] args) {
        Directory main = new Directory("main");
        File file1 = new File("text.txt", 1);
        File file2 = new File("work.pdf", 10);
        File file3 = new File("photo.jpg", 3);

        Directory subDir = new Directory("docs");
        File file4 = new File("product.docx", 18);

        main.addElement(file1);
        main.addElement(file2);
        main.addElement(subDir);
        subDir.addElement(file3);
        subDir.addElement(file4);

        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        main.accept(sizeVisitor);
        System.out.println("Total size -> " + sizeVisitor.getTotalSize() + " MB");

        SearchVisitor searchVisitor = new SearchVisitor(".docx");
        main.accept(searchVisitor);
        System.out.println("Matching files -> ");
        for (File f : searchVisitor.getMatchingFiles()) {
            System.out.println(" - " + f.getName() + " (" + f.getSize() + " MB)");
        }
    }
}
