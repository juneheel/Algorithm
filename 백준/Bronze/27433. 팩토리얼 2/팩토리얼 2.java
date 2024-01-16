import java.util.Scanner;

public class Main {
    public static long recursive(int n) {
        if(n==0)
            return 1;
        else
            return n*recursive(n-1);
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = recursive(n);
        System.out.println(result);
    }
}
