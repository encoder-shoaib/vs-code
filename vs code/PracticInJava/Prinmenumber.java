import java.util.Scanner;

public class Prinmenumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number= sc.nextInt();
        int count=0;

        for(int i=1 ; i<=number;i++)
    {
        if(number%i==0)
        {
            count++;
        }
    }
    if(count==2)
    {
        System.out.println("The number is a prime number");
    }
    else
    {
        System.out.println(" The number is not a prime  number");
    }


    }
}
