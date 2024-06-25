import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] students = new int[6][2];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); //성별
            int y = Integer.parseInt(st.nextToken()); //학년
            if(s==0){
                students[--y][0]++;
            }else {
                students[--y][1]++;
            }
        }

        int result = Solution(students,k);
        System.out.println(result);

    }

    private static int Solution(int[][]students,int k) {
        int room = 0;
        for(int i=0;i<2;i++){
            for(int j=0;j<students.length;j++){
                if(students[j][i]>k){
                    room+= students[j][i]%k==0? students[j][i]/k:(students[j][i]/k)+1;
                }else if(students[j][i]>0){
                    room++;
                }else
                    continue;
            }
        }
        return room;
    }
}
