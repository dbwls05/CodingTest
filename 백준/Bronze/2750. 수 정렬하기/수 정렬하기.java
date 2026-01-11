import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] num = new int[N];
        
        for(int i=0; i<N; i++) {
            num[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                if(num[i]>num[j]) {
                    int t = num[i];
                    num[i] = num[j];
                    num[j] = t;
                }
            }
        }
        
        for(int number : num) {
            System.out.println(number);
        }
    }
}