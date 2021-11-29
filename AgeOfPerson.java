import java.lang.*;
import java.util.*;

public class AgeOfPerson{

    public static void main(String args[]){

    int age;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter age: ");
    age = s.nextInt();

    if(age>=14 && age<=55){
        System.out.println("Young ");
    }
    else{  //if(age<14 || age>55)for not young
        System.out.println("Old ");
    }
  }
}
