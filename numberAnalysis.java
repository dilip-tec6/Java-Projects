package Java_Projects;
import java.util.Scanner;
public class numberAnalysis {
   public static void main(String[]arg) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number!");
       int number = sc.nextInt();
       if (number % 2 == 0){
           System.out.println("Its 'Even' number");
       }else{
           System.out.println("This number is 'Odd'");
       }
       if (number > 100) {
           System.out.println("Its Greater than 100 ");
       } else{
           System.out.println("This number is less than 100");
       }
       if (number < 0 ){
           System.out.println("Number is 'negative'");
       }else if (number > 0 ){
           System.out.println("Number is 'Positive' ");
       }
       else{
           System.out.println("Number is 'Zero'");
       }
        sc.close();
   }
}
