import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String num = sc.next();
        
        
        int sum =0;
        for(int i=0; i<num.length(); i++){
            int t = num.charAt(i) - '0';
            sum += t;
        }System.out.print(sum);
        
    }
}