import java.lang.*;

public class Student{

    String name;
    int Roll_no;

    public static void main(String args[]){

        //String name = "PAVAN";
        //int Roll_no = 2;
        Student s1 = new Student();
        s1.name ="PAVAN";
        s1.Roll_no = 2;
        System.out.println("Name:"+s1.name+ " and Roll_num:"+s1.Roll_no);
    }
}