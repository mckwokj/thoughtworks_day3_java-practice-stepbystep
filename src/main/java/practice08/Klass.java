package practice08;

import java.util.ArrayList;
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
}
