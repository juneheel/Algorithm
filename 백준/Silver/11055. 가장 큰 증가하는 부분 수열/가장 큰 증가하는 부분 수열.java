import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        dp(arr);
    }
    private static void dp(int[] arr){
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        for(int i=1;i<dp.length;i++){
            dp[i] = arr[i];
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[j]+arr[i],dp[i]);
                }
            }
        }
        int max=0;
        for(int i:dp){
            max = Math.max(i,max);
        }
        System.out.println(max);
    }
}
