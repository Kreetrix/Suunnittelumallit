package Assignment_9;

import Assignment_9.algorithms.BubbleSort;
import Assignment_9.algorithms.MergeSort;
import Assignment_9.algorithms.QuickSort;

public class Main {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        sorting.setStrategy(new BubbleSort());
        sorting.sortSmall(30);
        sorting.sortBig(100_000);
        sorting.setStrategy(new MergeSort());
        sorting.sortSmall(30);
        sorting.sortBig(100_000);
        sorting.setStrategy(new QuickSort());
        sorting.sortSmall(30);
        sorting.sortBig(100_000);
    }
}
