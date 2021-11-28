import java.lang.*;

class pattern{
    public static void main(String arg[]){
        int i,j;
        int n=10;

        for(i=n;i>0;i--){
            for(j=1;j<i;j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}