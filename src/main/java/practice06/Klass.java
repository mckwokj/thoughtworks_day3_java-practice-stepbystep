package practice06;

public class Klass {
    private int number;

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public int getNumber() {
        return number;
    }
}
