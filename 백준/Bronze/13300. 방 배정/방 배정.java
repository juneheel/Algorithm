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
        int[] girls = new int[6];
        int[] boys = new int[6];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); //성별
            int y = Integer.parseInt(st.nextToken()); //학년
            if(s==0){
                girls[--y]++;
            }else {
                boys[--y]++;
            }
        }

        int result = Solution(girls,boys);
        System.out.println(result);

    }

    private static int Solution(int[] girls, int[] boys) {
        int room = 0;
        for(int girl : girls){
            if(girl>2){
                room += girl/2+girl%2;
                continue;
            }
            if(girl>0){
                room++;
            }
        }
        for(int boy : boys){
            if(boy>2){
                room += boy/2+boy%2;
                continue;
            }
            if(boy>0){
                room++;
            }
        }
        return room;
    }
}
