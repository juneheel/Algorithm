import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word1 = br.readLine();
        String word2 = br.readLine();
        int[] alphabets = new int[26];
        int result = 0;

        for(int i=0;i<word1.length();i++){
            alphabets[word1.charAt(i)-'a']++;
        }
        for(int i=0;i<word2.length();i++){
            alphabets[word2.charAt(i)-'a']--;
        }
        for(int i=0;i<alphabets.length;i++){
            if(alphabets[i]!=0){
                result += Math.abs(alphabets[i]);
            }
        }
        System.out.println(result);
    }
}
