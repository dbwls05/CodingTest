import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        String answer = "";
        String str = sc.next();
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            if(Character.isUpperCase(ch))
                answer += Character.toLowerCase(ch);
            else answer += Character.toUpperCase(ch);
        }
        System.out.print(answer);
        
    }
}