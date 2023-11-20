import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] aChar = a.toCharArray();
        for(char ac : aChar){
            System.out.println(ac);
        }
    }
}