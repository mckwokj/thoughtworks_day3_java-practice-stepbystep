package practice08;

public class Teacher extends Person {
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return klass != null
                ? super.introduce() + " I am a Teacher. I teach Class " + klass.getNumber() + "."
                : super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        return student.getKlass().getNumber() == klass.getNumber()
                ? super.introduce() + " I am a Teacher. I teach " + student.getName() + "."
                : super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }
}