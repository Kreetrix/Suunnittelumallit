package Assignment_7;

enum Levels {
    NOVICE(200),
    INTERMEDIATE(600),
    EXPERT(1500),
    MASTER(3500);

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
        return String.format("\n\"level\": \"%s\", \"exp\": %d, \"hp\": %d", level, exp, hp);
    }
}
