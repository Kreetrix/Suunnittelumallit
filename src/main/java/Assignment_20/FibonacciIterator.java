package Assignment_20;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FibonacciIterator implements Iterator<Integer> {

    private int count = 0;
    private final int max;
    private int prev = 0;
    private int current = 1;

    public FibonacciIterator(int max) {
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return count < max;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Empty");
        }
        int nextValue = current;
        int temporary = current;
        current = current + prev;
        prev = temporary;

        count++;
        return nextValue;
    }
}
