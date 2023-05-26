package JavaArry.Simple.LinerSearch;

import java.util.Scanner;

public class ArrySearch {
    public static void main(String[] args) {
        System.out.println("input a number ");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();// scan size 
        int numbers[]= new int [size]; // array declayer

        for(int i=0 ; i<size; i++)
        {
            numbers[i]=sc.nextInt(); // array scan
        }
        
        System.out.println("inter a number that you have to find ");

        int find =sc.nextInt();// find number scan 

        for(int i=0 ; i<numbers.length;i++)
        {
            if(numbers[i]== find)
            {
                System.out.println("the given number leangth is "+ i);
            }
           

        }
        
    }
}
