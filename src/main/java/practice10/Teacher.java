package practice10;

import java.util.LinkedList;

public class Teacher extends Person {

    private LinkedList<Klass> classes = new LinkedList<>();

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;

        for (Klass klass: classes) {
            klass.setTeacherName(name);
        }
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public boolean isTeaching(Student student) {
        boolean isTeachingStudent = false;

        for (Klass klass: classes) {
            if (klass.isIn(student)) {
                isTeachingStudent = true;
                break;
            }
        }

        return isTeachingStudent;
    }

    @Override
    public String introduce() {
        String classNums = "";
        for (Klass klass: classes) {
            classNums += klass.getNumber() + ", ";
        }

        return classes.size() != 0
                ? super.introduce() + " I am a Teacher. I teach Class " + classNums.substring(0, classNums.length()-2) + "."
                : super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        boolean isInClass = false;
        for (Klass klass: classes) {
            if (klass.isIn(student)) {
                isInClass = true;
                break;
            }
        }
        return isInClass
                ? super.introduce() + " I am a Teacher. I teach " + student.getName() + "."
                : super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }
}