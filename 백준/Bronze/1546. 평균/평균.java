import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];
        int M =0;
        for(int i=0; i<N; i++){
            score[i] = sc.nextInt();
            if(score[i]>M)
                M = score[i];
        }
        double newSum =0;
        for(int i=0; i<score.length; i++){
            newSum += (double)score[i]/M*100;
            
        }
        System.out.print(newSum/(double)N+" ");
    }
}