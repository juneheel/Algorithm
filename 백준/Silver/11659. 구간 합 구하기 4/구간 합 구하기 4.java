import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static int[] arr = new int[100001];
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
         inputs = br.readLine().split(" ");
         for(int i=1;i<=n;i++){
             arr[i] = arr[i-1]+Integer.parseInt(inputs[i-1]);
         }

        for(int i=0;i<m;i++){
            inputs = br.readLine().split(" ");
            int start =Integer.parseInt(inputs[0]);
            int end = Integer.parseInt(inputs[1]);
            calculate(start,end);
        }
        System.out.println(sb);
    }
    private static void calculate(int start,int end){
        int result = arr[end]-arr[start-1];
        sb.append(result).append("\n");
    }
}
