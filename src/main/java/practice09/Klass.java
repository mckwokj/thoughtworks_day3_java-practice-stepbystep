package practice09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> members = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        String output = "It is not one of us.";
        for (Student member: members) {
            System.out.println();
            if (member.equals(student)) {
                leader = student;
                output = "";
                break;
            }
        }

        if (!output.equals("")) {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        members.add(student);
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public boolean isIn(Student student) {
        System.out.println(student.getKlass().getNumber() == number);
        return student.getKlass().getNumber() == number;
    }

    public static void main(String[] args) {
        LinkedList<Klass> linkedList = new LinkedList<Klass>();
        Klass klass3 = new Klass(3);
        Klass klass = new Klass(2);
        linkedList.add(klass);
        linkedList.add(klass3);
        Teacher tom = new Teacher(1, "Tom", 21, linkedList);
        Student jerry = new Student(1, "Jerry", 8, klass);

        tom.isTeaching(jerry);
    }
}
