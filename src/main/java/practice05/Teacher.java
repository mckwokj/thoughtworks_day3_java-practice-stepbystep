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
        String teacherMsg = super.introduce() + " I am a Teacher.";
        return klass != null
                ? teacherMsg + " I teach Class " + klass + "."
                : teacherMsg + " I teach No Class.";
    }
}