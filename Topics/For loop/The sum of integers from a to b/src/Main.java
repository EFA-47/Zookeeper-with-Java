import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int sum =0;
        for(;n1<=n2;n1++)
            {
                sum+=n1;
            }
        System.out.println(sum);
    }
}
