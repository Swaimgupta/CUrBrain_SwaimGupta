import java.util.*;
public class Main {


    public static int Absolute(int n, int a, int b){

        if(a<0|| a>9){
              System.out.print(" the entered no in A should between 0 to 9 ,the no is invalid ");
              return -1;
        }
        if(b<0 || b>9){
              System.out.print("The no is invalid it should be between 0 t0 9");
              return -1;
        }

        int count_a=0;
        int count_b=0;
        if(n == 0){
            if(a == 0){
                count_a++;
            }

            if(b == 0){
                count_b++;
            }

            }
            else{
                while(n > 0){
                    if(n % 10 == a){
                        count_a++;
                    }

                    if(n % 10 == b){
                        count_b++;
                    }

                    n = n / 10;
                }
            }

         return Math.abs(count_a - count_b);


    }

    public static void main(String[] args) {


      Scanner sc = new Scanner(System.in);
      System.out.print("enter the no: ");
      int n= sc.nextInt();
       System.out.print("enter the no A between 0 to 9: ");
      int a= sc.nextInt();
       System.out.print("enter the no B between 0 to 9: ");
      int b= sc.nextInt();
      if(n<0){
          System.out.println("no is invalid,The no should be greater than 0");
      }else{
      int result = Absolute(n, a, b);

      if(result != -1){
           System.out.println("The Absolute difference between frequency is " + result);
        }

    }
    }
}