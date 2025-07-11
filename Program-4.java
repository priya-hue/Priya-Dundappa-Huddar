public class MultiplesCount
  {
    public static void main(String[] args) 
    {
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        
        for (int i = 1; i <= 9; i++) 
        {
            int count = 0;

            // Check how many numbers are divisible by i
            for (int num : numbers)
              {
                if (num % i == 0)
                {
                    count++;
                }
            }

            // Print result
            System.out.println(i + ": " + count);
        }
    }
}
