package JavaArry.Simple.TwoDarrySearch;
import java.util.Scanner;

public class SarchOfNumber {
    public static void main(String[] args) {

        System.out.println("Give an array of rows an cols");

        Scanner sc = new Scanner( System.in);
        int rows = sc.nextInt();
        int cols= sc.nextInt();

        int matrix[][]= new int[rows][cols];

        System.out.println("Give an array valus");

        for(int i=0;i<rows;i++)
        {
            for(int j=0; j<cols; j++)
            {
                matrix [i][j]= sc .nextInt();
                
            }
            System.out.println( " enter next array ");
        }

        System.out.println( " enter the found number ");
        int find = sc.nextInt();

        System.out.println( " the final array is :-");
        for( int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.println(matrix[i][j]);



                if( matrix[i][j]==find)
            {
                 System.out.println("The leangth of this number is :"+ " "+ matrix[i][j]);

            }
            System.out.println(" ");
            }
        }

        
         
    }
}
