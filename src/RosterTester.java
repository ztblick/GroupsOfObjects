public class RosterTester
{
    public void run() {
        Student a = new Student("Douglas", 9);
        Student b = new Student("Nandhini", 12);
        Student c = new Student("Zach", 5);

        Student[] roster = {a, b, c};

//        Roster r = new Roster(roster);
        // This should print: "[Dogulas, Nandhini, Zach]"
//        System.out.println(r);
//
//        Student d = new Student("Dennis", 31);
//
//        r.add(d);
//        r.remove(0);
//
//        // This should print: "[Nandhini, Zach, Dennis]"
//        System.out.println(r);
    }

    public static void main(String[] args)
    {
        RosterTester t = new RosterTester();
        t.run();
    }
}