import java.lang.*;

public class Student1{

    int roll_no;
    long phone_num;
    String address;
}
    public class Main{
    public static void main(String args[]){

        Student student_1 = new Student();
        Student student_2 = new Student();
        
        student_1.roll_no = 56;
        student_1.phone_num = 123456789;
        student_1.address = "NASHIK";
        student_2.roll.no = 85;
        student_2.phone_num = 784956123;
        student_2.address = "PUNE";

        System.out.println(student_1.roll_no+""+student_1.phone_num+""+student_1.address);
        System.out.println(student_2.roll_no+""+student_2.phone_num+""+student_2.address);
    }
}
