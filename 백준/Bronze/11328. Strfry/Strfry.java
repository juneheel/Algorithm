import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0;i<n;i++){
            boolean possible= true;
            int[] alphabets = new int[26];
            String[] words = br.readLine().split(" ");
      
            for(int j=0;j<words[0].length();j++){
                alphabets[words[0].charAt(j)-'a']++;
            }
            for(int j=0;j<words[1].length();j++){
                alphabets[words[1].charAt(j)-'a']--;
            }
            for(int a=0;a<alphabets.length;a++){
               if(alphabets[a]!=0){
                   possible = false;
                   break;
               }
            }
            if(possible==true){
                System.out.println("Possible");
            }else{
                System.out.println("Impossible");
            }
        }
    }
}
