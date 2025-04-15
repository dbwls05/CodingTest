import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int e = sc.nextInt();
        
        if(90<=e && e<=100){
            System.out.println("A");
        }else if(80<=e && e<=89){
            System.out.println("B");
        }else if(70<=e && e<=79){
            System.out.println("C");
        }else if(60<=e && e<=69){
            System.out.println("D");
        }else if(0<=e && e<=59){
            System.out.println("F");
        }
    }
    
}