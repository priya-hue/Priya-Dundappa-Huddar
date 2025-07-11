import java.util.Scanner;

public class OddSeries 
{
    public static void main(String[] args) 
  {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();

        if (a % 2 == 0) //if number is even reduce 1 
        {
            a = a - 1;
        }
      
        int num = 1;
        for (int i = 1; i <= a; i++) 
        {
            System.out.print(num);
            if (i < a) 
            {
                System.out.print(", ");
            }
            num = num + 2;
        }
    }
}
