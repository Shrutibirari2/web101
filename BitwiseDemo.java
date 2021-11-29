import java.lang.*;

public class BitwiseDemo{

    public static void main(String args[]){
         
        int x = 10; //0b1010
        int y = 6; //0b0110
        int z;
        //z = x & y;
        //z = x | y;
        z = x ^ y;
        System.out.println(z);
    }
}