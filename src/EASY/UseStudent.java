package EASY;

public class UseStudent {
    public static void main(String[] args) {
        Student s;
        s = new Student();
        s.setStudent(-101, "Nirbhay", 65.76);
        s.showStudent();

        Student p;
        p = new Student();
        p.setStudent(102, "Singh" , 67.8);
        p.showStudent();

        Student y;
        y = new Student();
        y.setStudent(103, "Kunal" , 67.80);
        y.showStudent();
    }
}
