import java.util.*;
public class Main {
    public static int Difference(int n){

    int sum=0;
    int product=1;
    while(n>0){
        sum+=n%10;
        product =product*(n%10);
        n=n/10;
    }
       return product-sum;     

    } 

    public static void main(String[] args) {


      Scanner sc = new Scanner(System.in);
      System.out.println("enter the no: ");
      int n= sc.nextInt();
      if(n<0){
          System.out.println("no is invalid,The no should be greater than 0");
      }else{
          System.out.println("The Difference Between Product and sum is "+Difference(n));
      }

    }
}