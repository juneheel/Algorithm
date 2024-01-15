import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int half = n;
        n = 2*n;
        int m = Integer.parseInt(st.nextToken());

        int[][] A = new int[n][m];
        int[][] result = new int[half][m];

        for(int i=0;i<n;i++){
            st= new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<half;i++){
            for(int j=0;j<m;j++){
                result[i][j] = A[i][j] + A[i+half][j];
            }
        }

        for(int[] re : result){
            for(int r:re ){
                System.out.print(r + " ");
            }
            System.out.println();
        }


    }
}
