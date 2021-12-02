package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> members = new ArrayList<>();
    private String teacherName;

    public Klass(int number) {
        this.number = number;
    }

    public Klass(int number, String teacherName) {
        this.number = number;
        this.teacherName = teacherName;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        String output = "It is not one of us.";
        for (Student member: members) {
            if (member.equals(student)) {
                leader = student;
                output = "";
                System.out.print(Teacher.createAssignMsg(student.getName(), teacherName, "leader", getDisplayName()));
                break;
            }
        }

        if (!output.equals("")) {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        members.add(student);
        System.out.print(Teacher.createAssignMsg(student.getName(), teacherName, "member", getDisplayName()));
    }

    private String teacherAssignMsg (Student student) {
        return "I am "+ teacherName+ ". I know " + student.getName();
    }

    public int getNumber() {
        return number;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Student getLeader() {
        return leader;
    }

    public List<Student> getMembers() {
        return members;
    }

    public boolean isIn(Student student) {
        System.out.println(student.getKlass().getNumber() == number);
        return student.getKlass().getNumber() == number;
    }
}
