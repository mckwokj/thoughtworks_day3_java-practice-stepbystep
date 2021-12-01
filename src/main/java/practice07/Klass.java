package practice07;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        leader = student;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }
}
