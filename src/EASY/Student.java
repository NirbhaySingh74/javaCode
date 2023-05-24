package EASY;

public class Student {
    private int roll;
    private String name;
    private double per;

    public void setStudent(int r, String s, double p) {
        if(r <= 0) {
            System.out.println("Roll No ican't be defined");
        }
        else

        roll = r;
        name = s;
        per = p;
    }
    public void showStudent() {
        System.out.println("Roll = " +roll);
        System.out.println("Name = " + name);
        System.out.println("Per = " + per);
    }
}
