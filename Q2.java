import java.util.*;
public class Main {

    public static int reverse_and_double(int n){

        int temp=0;
        if(n<0){
            n=-n;
            temp=1;
        }

        int sum=0;
        while (n>0){
            sum =sum*10+ (2*(n%10));
            n=n/10;
        }


        if(temp == 1){
            return -sum;
        }else{
            return sum;
        }
    }

    public static void main(String[] args) {


      Scanner sc = new Scanner(System.in);
      System.out.println("enter the no: ");
      int n= sc.nextInt();
      if(n==0){
          System.out.println("The reverse of 0 is 0");
      }else{
          System.out.println("the reverse of " + n + " is : " + reverse_and_double(n));
      }

    }
}