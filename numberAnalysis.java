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

       // Read the first number.
       System.out.println("Enter number 1");
       int number = sc.nextInt();
       int max = number;
       int mini = number;
       
       // counter for the first number
            if (number % 2 == 0) evenCount++; else oddCount++;
            if (number > 0) positiveCount++;
            else if (number < 0) negativeCount++;
            else zeroCount++;
            
       for (int i = 1; i < times;i++) {
           System.out.println("Enter the numbers!!!" + (i+1) + ":" );
            number = sc.nextInt();
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
            
           if (number > max) max = number;
           if (number< mini) mini  = number; 
         }

       System.out.println("Total Even count " + evenCount);
       System.out.println("Total Odd count " +oddCount );
       System.out.println("Total Negative count " +negativeCount);
       System.out.println("Total Positive count " + positiveCount);
       System.out.println("Total Zero count " + zeroCount);
       System.out.println("The max number is " + max);
       System.out.println("The mini number is " + mini);
       System.out.println("today task to get the binary version of the max and mini number and using the arry on it ");
        sc.close();
   }
}
