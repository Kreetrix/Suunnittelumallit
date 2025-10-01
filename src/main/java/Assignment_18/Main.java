package Assignment_18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book("Author 1", "Title 1", "Documentary", "1984");
        Book book2 = new Book("Author 1", "Title 2", "Fantasy", "1934");

        Recommendation recommendation1 = new Recommendation("Documentary enjoyers");
        recommendation1.addBook(book2);

        Recommendation recommendation2 = new Recommendation("Fantasy Fans");
        recommendation2.addBook(book1);

        List<Recommendation> recommendations = new ArrayList<>();
        recommendations.add(recommendation2);
        recommendations.add(recommendation2);

        boolean running = true;
        while (running) {
            System.out.println("Book recommendataion demo");
            System.out.println("1. View recommendations");
            System.out.println("2. Clone a recommendation");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < recommendations.size(); i++) {
                        System.out.println("[" + i + "] " + recommendations.get(i));
                    }
                    break;
                case 2:
                    System.out.print("Enter index to clone: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    if (index < 0 || index >= recommendations.size()) {
                        System.out.println("Invalid index");
                        break;
                    }
                    Recommendation original = recommendations.get(index);
                    Recommendation clone = original.clone();
                    System.out.print("Enter new target audience for the clone: ");
                    clone.setTargetAudience(scanner.nextLine());
                    recommendations.add(clone);
                    System.out.println("Cloned!");
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }
}
