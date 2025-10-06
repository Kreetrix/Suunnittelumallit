package Assignment_20;

import java.util.Iterator;

public class FibonacciSequence implements SequenceInterface {

    private final int value;

    public FibonacciSequence(int value) {
        this.value = value;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(value);
    }

}
