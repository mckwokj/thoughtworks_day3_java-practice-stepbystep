package practice10;

public class Student extends Person {
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String studentMsg = super.introduce() + " I am a Student.";
        if (klass.getLeader() != null && klass.getLeader().getName().equals(getName())) {
            return studentMsg + " I am Leader of Class " + klass.getNumber() + ".";
        }
        return studentMsg + " I am at Class " + klass.getNumber() + ".";
    }
}