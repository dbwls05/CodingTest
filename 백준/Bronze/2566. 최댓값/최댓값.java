import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max=0;
        int row = 1;
        int col = 1;
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j]>max){
                    max = arr[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.print(row+" "+col);
    }
}