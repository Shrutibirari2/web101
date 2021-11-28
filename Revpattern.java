import java.lang.*;

class Revpattern{
    public static void main(String arg[]){

        int n = 10;
        int i,j;
        for(i=1;i<n;i++){
            for(j=1;j<i;j++){
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}