import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
     static int reverse(int n){
         String sn = Integer.toString(n);
        char [] result = new char[sn.length()];
        String revresult;
        for(int i=0;i<sn.length();i++){
            result[i] =  sn.charAt(sn.length()-1-i); //charAt도 인덱스이므로 0부터 시작하므로
        }

        revresult =  new String(result);
        return Integer.parseInt(revresult);
    }

    static boolean sosu(int n){
         boolean result = false;
         for(int i=2;i<n;i++){
             if(n%i == 0){
                 result = false;
                 break;
             }
             else{
                 result = true;
             }
         }
         return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());

        int ren = reverse(n); // 팰린드롬을 위해 reverse n 결과값

        int result = 0;


        while(result==0){
            if(n==1||n==2){
                n=2;
                break;
            }
            if(n == ren){
                boolean sosuresult = sosu(n);

                if(sosuresult == true) {
                    result++;
                }
                else{
                    n++;
                    ren = reverse(n);
                }
            }else {
                n++;
                ren = reverse(n);

            }
        }

        System.out.println(n);
    }
}
