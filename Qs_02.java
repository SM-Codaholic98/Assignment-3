class Student{
    int stu_ID;
    String name;

    Student(int id, String n){
        this.stu_ID = id; this.name = n;
        System.out.println("Student ID = " + this.stu_ID);
        System.out.println("Student Name = " + this.name);
    }
}

public class Qs_02 {
    public static void main(String[] args){
        new Student(105, "ABCD");
    }
}