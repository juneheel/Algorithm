import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());
        long consider = 0;
        long count =0;
        long i=1;
       while(true){
           if(s-consider<i)
           {
               break;
           }
           else {
               consider += i;
               i++;
               count++;
           }
       }
        System.out.println(count);

    }
}

