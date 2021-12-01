package practice05;

public class Teacher extends Person {
    private Integer klass;

    public int getKlass() {
        return klass;
    }

    public Teacher(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return klass != null ? super.introduce() + " I am a Teacher. I teach Class " + klass + "."
                : super.introduce() + " I am a Teacher. I teach No Class.";
    }
}