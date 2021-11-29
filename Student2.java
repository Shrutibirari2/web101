class Student2 {

    int RollNumber;
    
    int PhoneNumber;
    
    String Address;
    
    }
    
    public class CreateClass {
    
    public static void main(String[] args) {
    
    Student Sam = new Student();
    
    Student John = new Student();
    
    Sam.RollNumber=20;
    
    Sam.PhoneNumber=1234567890;
    
    Sam.Address="London !";
    
    John.RollNumber=01;
    
    John.PhoneNumber=976541230;
    
    John.Address="China !";
    
    System.out.println(Sam.RollNumber+" "+Sam.PhoneNumber+" "+Sam.Address); System.out.println(John.RollNumber+" "+John.PhoneNumber+" "+John.Address);
    
    }
    
    }