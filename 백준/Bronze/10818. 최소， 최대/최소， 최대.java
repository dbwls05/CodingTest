import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A = sc.nextLong();
        long max = A;
        long min = A;
        for(int i=1; i<N; i++){
            long a = sc.nextLong();
            if(a>max) max = a;
                
            if(min>a) min = a;  
        }
        System.out.print(min+" "+max);
    }
}