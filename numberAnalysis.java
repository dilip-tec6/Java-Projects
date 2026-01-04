package Java_Projects;
import java.util.Scanner;
public class numberAnalysis {
   public static void main(String[]arg) {
       Scanner sc = new Scanner(System.in);
       System.out.println("How many time you want to analysis the number?");
       int times = sc.nextInt();
       int evenCount = 0;
       int oddCount = 0;
       int negativeCount = 0;
       int positiveCount = 0;
       int zeroCount = 0;
       for (int i = 0; i < times;i++) {
           System.out.println("Enter the numbers!!!");
           int number = sc.nextInt();
           if (number % 2 == 0) {
               evenCount++;
               System.out.println("Its 'Even' number");
           } else {
               oddCount++;
               System.out.println("This number is 'Odd'");
           }
           if (number > 100) {
               System.out.println("Its Greater than 100 ");
           } else {
               System.out.println("This number is less than 100");
           }
           if (number < 0) {
               negativeCount++;
               System.out.println("Number is 'negative'");
           } else if (number > 0) {
               positiveCount++;
               System.out.println("Number is 'Positive' ");
           } else {
               zeroCount++;
               System.out.println("Number is 'Zero'");
           }

       }
       System.out.println("Total Even count " + evenCount);
       System.out.println("Total Odd count " +oddCount );
       System.out.println("Total Negative count " +negativeCount);
       System.out.println("Total Positive count " + positiveCount);
       System.out.println("Total Zero count " + zeroCount);
        sc.close();
   }
}
