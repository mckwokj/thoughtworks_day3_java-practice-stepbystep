package practice10;

import java.util.LinkedList;

public class Teacher extends Person {

    private LinkedList<Klass> classes = new LinkedList<>();

    private String teacherMsg = super.introduce() + " I am a Teacher.";

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
                ? teacherMsg + " I teach Class " + classNums.substring(0, classNums.length()-2) + "."
                : teacherMsg + " I teach No Class.";
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
                ? teacherMsg + " I teach " + student.getName() + "."
                : teacherMsg + " I don't teach " + student.getName() + ".";
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public static String createAssignMsg(String studentName, String teacherName, String msgType, String className) {
        String commonMsg = "I am "+ teacherName+ ". I know " + studentName;
        if (msgType.equals("leader")) {
            return commonMsg + " become Leader of " + className+ ".\n";
        } else if (msgType.equals("member")){
            return commonMsg + " has joined " +   className + ".\n";
        }
        return null;
    }
}