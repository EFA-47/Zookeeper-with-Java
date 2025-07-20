import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double road = scanner.nextDouble();
        double hour = scanner.nextDouble();

        System.out.println(road/hour);
    }
}
