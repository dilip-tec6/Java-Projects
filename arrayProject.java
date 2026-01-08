package Java_Projects;
import java.util.Scanner;
public class arrayProject {
    public static void main(String []arg) {
      Scanner sc = new Scanner(System.in);

      // ask for the size
        System.out.println("Enter number of element");
        int n = sc.nextInt();

        //creating the array
      int[] x = new int [n] ;

      //counters
        int positive = 0 , negative = 0, zero = 0;
        int even = 0, odd= 0;
      for(int i = 1 ; i<= x.length;i++){
          System.out.println("Enter number" + (i+1)+ ":");
          x[i]=sc.nextInt();

          if (x[i]>0)positive++;
          else if (x[i]<0) negative++;
          else zero++;

          if(x[i]%2==0)even++;
          else odd++;
      }
      
        sc.close();
    }
}
