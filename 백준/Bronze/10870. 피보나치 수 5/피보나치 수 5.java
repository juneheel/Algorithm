import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int pibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return pibo(n-1) + pibo(n-2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int result = pibo(n);
        System.out.println(result);
    }
}
