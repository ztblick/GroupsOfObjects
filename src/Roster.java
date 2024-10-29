import java.util.ArrayList;

public class Roster {
    private ArrayList<Student> roster;

    public Roster(ArrayList<Student> students) {
        roster = students;
    }

    public Roster() {
        roster = new ArrayList<Student>();
    }

    public void add(Student s) {
        roster.add(s);
    }

    public void remove(int target) {
        roster.remove(target);
    }

//    public String toString() {
//        String out = "[";
//        for (int i = 0; i < roster.length - 1; i++) {
//            out += roster[i].getName() + ", ";
//        }
//        out += roster[roster.length - 1].getName() + "]";
//        return out;
//    }
}