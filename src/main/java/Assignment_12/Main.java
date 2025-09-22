package Assignment_12;

import java.nio.file.AccessDeniedException;

public class Main {
    public static void main(String args[]) {
        Library library = new Library();

        library.addUnprotectedDocument("123", "Content of the unprotected document");
        library.addProtectedDocument("1020", "Content of the protected document", 1);

        User pekka = new User("pekka", 0);
        User vesa = new User("vesa", 1);
        User matti = new User("matti", 1);

        try {
            library.getDocument("123").getContent(matti);
            library.getDocument("123").getContent(vesa);
            library.getDocument("123").getContent(pekka);

            library.getDocument("1020").getContent(matti);
            library.getDocument("1020").getContent(vesa);
            library.getDocument("1020").getContent(pekka);
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

    }
}
