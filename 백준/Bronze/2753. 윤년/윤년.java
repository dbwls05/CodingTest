import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int y = sc.nextInt();
        int sum=0;
        
        if(y%4==0 && y%100!=0)
           sum = 1;
        else if(y%400==0)
            sum = 1;
        else
            sum = 0;
        
        System.out.println(sum);
    }      
}