package Assignment_9;

public class Sorting {
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortBig(int elements) {

        int[] bigArr = new int[elements];
        for (int i = 0; i < bigArr.length; i++) {
            bigArr[i] = (int) (Math.random() * elements);
        }

        System.out.printf("Strting big sort using %s algorithm with %d elements\n", strategy.getName(), bigArr.length);

        long start = System.nanoTime();

        strategy.sort(bigArr);

        long end = System.nanoTime();

        long elapsed = end - start;
        System.out.printf("%s big took %.3f ms%n", strategy.getName(), elapsed / 1_000_000.0);
    }

    public void sortSmall(int elements) {
        int[] smallArr = new int[elements];
        for (int i = 0; i < smallArr.length; i++) {
            smallArr[i] = (int) (Math.random() * elements);
        }

        System.out.printf("Strting small sort using %s algorithm with %d elements\n", strategy.getName(),
                smallArr.length);

        long start = System.nanoTime();

        strategy.sort(smallArr);

        long end = System.nanoTime();

        long elapsed = end - start;
        System.out.printf("%s small took %.3f ms%n", strategy.getName(), elapsed / 1_000_000.0);
    }
}
