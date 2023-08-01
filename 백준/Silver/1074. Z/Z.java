import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[][]arr = new int[N][N];
//        double count = Math.pow(2, N-1);

        double preResult=0;

        while(N!=0) {
            double count = Math.pow(2, N-1);
            if (r < count && c < count) { //1사분면
                preResult += 0;
//                System.out.println("1사분면에 해당합니다");
            } else if (r < count && c >= count) { //2사분면
                preResult += count * count;
                c-=count;
//                System.out.println("2사분면에 해당합니다");
            } else if (r >= count && c < count) { //3사분면
                preResult += 2 * count * count;
                r-=count;
//                System.out.println("3사분면에 해당합니다");
            } else {
                preResult += 3 * count * count;
                c-=count;
                r-=count;
//                System.out.println("4사분면에 해당합니다");
            }
            N--;
        }

        System.out.println((int)preResult);

    }
}
