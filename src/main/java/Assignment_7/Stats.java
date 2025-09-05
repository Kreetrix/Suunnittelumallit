package Assignment_7;

enum Levels {
    NOVICE(100),
    INTERMEDIATE(300),
    EXPERT(1000),
    MASTER(10000);

    private int threshold;

    Levels(int threshold) {
        this.threshold = threshold;
    }

    public int getThreshold() {
        return threshold;
    }
}

public record Stats(Levels level, int exp, int hp) {

    @Override
    public String toString() {
        return String.format("\"level\": \"%s\", \"exp\": %d, \"hp\": %d", level, exp, hp);
    }
}
