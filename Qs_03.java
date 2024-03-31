class Student{
    int stu_ID;
    String name;

    void func(int id, String n){
        this.stu_ID = id; this.name = n;
        System.out.println("Student ID = " + this.stu_ID);
        System.out.println("Student Name = " + this.name);
    }
}

public class Qs_03 {
    public static void main(String[] args){
        Student stu = new Student();
        stu.func(105, "ABCD");
    }
}