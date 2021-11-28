import java.lang.*;

 public class StringMethod1{

    public static void main(String[] args){

        String str = new String("visualstudio");
        int len = str.length();
        System.out.println(str.length());

        String str1 = str.toUpperCase();
        System.out.println(str1);

        String str2 = new String("   shruti    ");
        str2 = str.trim();
        System.out.println(str2);

        String str3 = new String("savitribai");
        String str0 = str3.substring(7);
        String str4 = str3.substring(0,7);
        System.out.println(str4);
        System.out.println(str0);

        String str5 = str3.replace('i','d');
        System.out.println(str3+ " "+str5);
    }
 }