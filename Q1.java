import java.util.*;

public class Main {

public static Boolean Count(long n){
    int count=0;

    if(n<0){
        n=-n;
    }

    if(n==0){
        count++;
    }

    while(n>0){

        n=n/10;
        count++;

    }

    return count%2==0;
}

    public static void main(String[] args) {


      Scanner scanner = new Scanner(System.in);
      System.out.println("enter the no ");
      long n= scanner.nextLong();
      Boolean b=Count(n);
      System.out.println(b);
    }
}
