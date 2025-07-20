import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for(int i =0;i<n;i++)
            {
                String m = scanner.next();
                switch (m) {
                    case "A" -> a++;
                    case "B" -> b++;
                    case "C" -> c++;
                    case "D" -> d++;
                }
            }

        System.out.println(d+" "+c+" "+b+" "+a);

    }
}
