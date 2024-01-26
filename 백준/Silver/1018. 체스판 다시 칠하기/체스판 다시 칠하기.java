import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static List<Integer> results = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        String[][] chess = new String[n][m];

        for(int i=0;i<n;i++){
            String[] lines = br.readLine().split("");
            for(int j=0;j<m;j++){
                chess[i][j] = lines[j];
            }
        }

        check(chess);
        results.sort(((o1, o2) -> o1-o2));
        System.out.println(results.get(0));
    }

    static void check(String[][] chess){
        int wCount=0;
        int bCount=0;
        String[] black_start = {
                "BWBWBWBW",
                "WBWBWBWB",
                "BWBWBWBW",
                "WBWBWBWB",
                "BWBWBWBW",
                "WBWBWBWB",
                "BWBWBWBW",
                "WBWBWBWB"
        };

        String[] white_start= {
                "WBWBWBWB",
                "BWBWBWBW",
                "WBWBWBWB",
                "BWBWBWBW",
                "WBWBWBWB",
                "BWBWBWBW",
                "WBWBWBWB",
                "BWBWBWBW",
        };

        for(int i=0;i<=n-8;i++){
            for(int j=0;j<=m-8;j++){
                for(int x = i;x<i+8;x++){
                    String[] black_starts = black_start[x-i].split("");
                    String[] white_starts = white_start[x-i].split("");
                    for(int y=j;y<j+8;y++){
                         if(!chess[x][y].equals(black_starts[y-j])){
                            bCount++;
                        }
                        if(!chess[x][y].equals(white_starts[y-j])){
                            wCount++;
                        }
                    }
                }
                results.add(Math.min(bCount,wCount));
                bCount=0;wCount=0;
            }
        }

    }
}
