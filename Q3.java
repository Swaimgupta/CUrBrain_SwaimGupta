import java.util.*;
public class Main {
    public static int IsPalindrome(int n){
        int Orignal=n;
        if(n<0){
          n=-n;  
        }

        int rev=0;
        while(n>0){
            rev= rev*10+n%10;
            n=n/10;
        }

        if(Orignal!=rev&&Orignal>0){
            System.out.println("not Palindrome");
            return Orignal+rev;
        }
        else if (Orignal<0){
            System.out.println("not Palindrome");
            return Orignal-rev;
        }
        else if(Orignal==rev){
            System.out.println("Palindrome");
            return Orignal; 
        }else {
            System.out.println("not valid in context");
            return 0;
        }


    } 




    public static void main(String[] args) {


      Scanner sc = new Scanner(System.in);
      System.out.println("enter the no: ");
      int n= sc.nextInt();
      if(n==0){
          System.out.println("Palindrome");
      }else{
          System.out.println(IsPalindrome(n));
      }

    }
}