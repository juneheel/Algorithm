import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int x,y;
    static int a,b,c,d,e,f;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());
        y = (d*c-a*f)/(d*b-a*e);
        for(int i=-999;i<1000;i++){
            if(a*i+b*y == c && d*i+e*y==f) {
                x=i;
                break;
            }
        }
        System.out.printf("%d %d",x,y);
    }
}

