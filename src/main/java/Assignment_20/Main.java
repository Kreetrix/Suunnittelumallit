package Assignment_20;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        FibonacciSequence sequence = new FibonacciSequence(10);

        Iterator iterator = sequence.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
