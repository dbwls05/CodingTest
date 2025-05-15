import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int C = sc.nextInt();
        
        int min = B+C;
        if(min>=60){
            A=A+(min/60);
            min=min%60;
        }
        if(A>=24){
            A=A%24;
    
        }
        System.out.print(A+" "+min);
    }
}