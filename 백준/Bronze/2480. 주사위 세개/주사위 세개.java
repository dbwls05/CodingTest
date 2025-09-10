import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int answer;
        int max=0;
        
        int[]num = new int[3];
        
        for(int i=0; i<num.length; i++) {
            num[i] = sc.nextInt();
            if(num[i]>max)
                max=num[i];
        }
        
        if(num[0]*3 == num[0]+num[1]+num[2]){
                answer = 10000+num[0]*1000;
        }else if(num[0]==num[1] || num[0]==num[2]){
                answer = 1000+num[0]*100;
        }else if(num[1] == num[2]){
            answer = 1000+num[1]*100;
        }else answer = max*100;
        
        System.out.println(answer);
    }
}