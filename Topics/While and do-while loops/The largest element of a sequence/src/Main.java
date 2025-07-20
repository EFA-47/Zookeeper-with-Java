import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int i;
        int max = 0;
        while((i = scanner.nextInt()) !=0)
        {
            if(max < i)
            {
                max = i;
            }
        }
        System.out.println(max);
    }
}