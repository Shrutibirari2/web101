import java.lang.*;

public class StringPractice{

    public static void main(String agrs[]){

        String str1 = "Java Program";
        String str2 = new String("JAVA");
        char c[] = {'H','E','L','L','O'};
        String str3 = new String(c);

        byte b[] = {65,66,67,68};
        //String str4 = new String(b);
        String str4 = new String(b,2,2);//index 2 to 2 letter
 
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }
}