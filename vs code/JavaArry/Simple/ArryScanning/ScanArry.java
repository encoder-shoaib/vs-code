package JavaArry.Simple.ArryScanning;
import java.util.*;

public class ScanArry {
    public static void main(String[] args) {

        System.out.println("give size of arry ");

        Scanner sc = new Scanner(System.in);

        // size input
        int size= sc.nextInt();
         
        // create put value 
        int numbers[]= new  int[size];

        // arry value input 
        for( int i=0 ; i<size ;i++)
        {
            numbers[i]= sc.nextInt();
        }

        // for out put 
         for(int i=0 ;i< size; i++)
         {
            System.out.println(numbers[i]);
            
         }
    }
}
