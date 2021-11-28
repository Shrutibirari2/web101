import java.lang.*;
import java.util.*;

class Primenum{
    public static void main(String arg[]){

        int i=0,m=0,flag=0;
        for(i=2;i<=10;i++)
        {
            for(n=i;n>=1;n--){
            if(n%i == 0){
            flag = flag + 1;
            break;
            }
          }
        if(flag == 2){
            System.out.println("Number is Prime:");
        }
      }
  }
}