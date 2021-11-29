import java.lang.*;
import java.util.scanner;

public class Area{

    public static void main(String arg[]){
        float height,base,c;
        System.out.println("Enter base and height");

        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();

        c = base * height/2;
        System.out.println("Area of traingle is "+c);

    }
}