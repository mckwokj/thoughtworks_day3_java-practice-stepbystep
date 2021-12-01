package practice06;

public class Teacher extends Person {
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return klass != null ? super.introduce() + " I am a Teacher. I teach Class " + klass.getNumber() + "."
                : super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        return student.getKlass().getNumber() == klass.getNumber() ? super.introduce() + " I am a Teacher. I teach " + student.getName() + "."
                : super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";

        // My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.
    }
}