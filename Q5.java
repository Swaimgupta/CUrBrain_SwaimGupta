import java.util.*;
public class Main {
     public static ArrayList<Integer> getList(int n){
         ArrayList<Integer> list = new ArrayList<>();

         int count=0;
         while(n>0){
            int temp=n%10;
            if(temp%2==0){
                list.add(0);
            }
            else{
                list.add(temp);
            }

            n= n / 10;
            count++; 

         }


         for(int i=0;i<(count/2);i++){

             int temp = list.get(i);
             list.set(i,list.get(count-1-i));
             list.set(count-i-1,temp);

         }



         return list;

     }

    public static void main(String[] args) {


      Scanner sc = new Scanner(System.in);
      System.out.print("enter the no: ");
      int n= sc.nextInt();
      if(n<0){
          System.out.println("no is invalid,The no should be greater than 0");
      }else{
          ArrayList<Integer> result = getList(n);
          System.out.println("The lists of number is  "+result);
      }

    }
}