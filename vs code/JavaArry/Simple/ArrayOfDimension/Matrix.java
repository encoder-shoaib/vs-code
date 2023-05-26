package JavaArry.Simple.ArrayOfDimension;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Matrix {
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
        System.out.println( " the final array is :-");

        for(int i =0;i<rows; i++)
        {
            for( int j=0 ; j<cols;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
         
    }
}
