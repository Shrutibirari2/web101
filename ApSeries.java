import java.lang.*;
import java.util.*;

public class ApSeries{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number of terms:");
        System.out.println("Enter a,d,n");
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        
        int term = a;
        for(int i=0;i<n;i++)
        {
            System.out.print(term+",");
            term = term+d;
        }
    }
}