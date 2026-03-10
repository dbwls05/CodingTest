import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int I = sc.nextInt();

        int round = 0;

        while (K != I) {
            K = (K + 1) / 2;
            I = (I + 1) / 2;
            round++;
        }

        System.out.println(round);
    }
}
