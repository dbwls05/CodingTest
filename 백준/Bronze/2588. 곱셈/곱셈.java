import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String n1 = String.valueOf(a);
        String n2 = String.valueOf(b);
        
        int p1 = n2.charAt(2)-'0';
        int p2 = n2.charAt(1)-'0';
        int p3 = n2.charAt(0)-'0';
        
        System.out.println(a*p1);
        System.out.println(a*p2);
        System.out.println(a*p3);
        System.out.println(a*b);

        
    }
}