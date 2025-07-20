import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int busHeight = scanner.nextInt();
        int bridgeCount = scanner.nextInt();
        int bridgeHeight;
        boolean crashed = false;
        for(int i = 0; i<bridgeCount; i++)
        {
            bridgeHeight = scanner.nextInt();
            if(bridgeHeight<=busHeight)
            {
                System.out.printf("Will crash on bridge %d", i+1);
                crashed = true;
                break;
            }

        }

        if(!crashed)
        {
            System.out.println("Will not crash");
        }
    }
}