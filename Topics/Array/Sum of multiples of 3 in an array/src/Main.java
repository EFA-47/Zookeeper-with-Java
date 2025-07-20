import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create scanner instance to read input
        Scanner scanner = new Scanner(System.in);

        // read the number of elements
        int n = scanner.nextInt();

        // create your array here
        int[] numbers = new int[n];
        int sum = 0;
        // use a loop to read the array elements
        for(int i = 0; i < n; i++)
        {
            numbers[i] = scanner.nextInt();
            if((numbers[i] %3 ==0))
            {
                sum+= numbers[i];
            }
        }
        // use a loop to calculate the sum of elements that are multiples of 3
        System.out.println(sum);
        // close the scanner
        scanner.close();
    }
}