import java.util.Scanner;

public class Main {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            int result = dfs(i);
            if(result == n){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
    static int dfs(int i){
        String number = Integer.toString(i);
        String[] numbers = number.split("");
        int hap=Integer.parseInt(number);
        for(String n:numbers){
            hap+=Integer.parseInt(n);
        }
        return hap;
    }
}
