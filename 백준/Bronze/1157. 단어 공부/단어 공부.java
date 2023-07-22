import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String word = br.readLine();

        for (int i = 0; i < word.length(); i++) {
            if ('a' <= word.charAt(i)) {
                arr[word.charAt(i) - 97]++;
            } else {
                arr[word.charAt(i) - 65]++;
            }
        }

        int max = 0;
        char result = '?';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = (char) (i + 65);
            } else if (arr[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
        
    }
}
