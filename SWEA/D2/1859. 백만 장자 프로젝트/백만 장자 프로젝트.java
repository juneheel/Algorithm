/////////////////////////////////////////////////////////////////////////////////////////////
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int test_case=0;test_case<T;test_case++){
            int n = sc.nextInt();
            int[] days = new int[n];
            int max = 0;
            int maxDay = 0;
            long money = 0;
            int nowDay = 0;
            for(int i=0;i<n;i++){
                days[i] = sc.nextInt();
                if(days[i]>=max){
                    max = days[i];
                    maxDay = i;
                }
            }
            
            while(nowDay<n){
                for(int i=nowDay;i<maxDay;i++){
                    money += max - days[i];
                }
                nowDay = maxDay+1;
                max=0;
                for(int i=nowDay;i<n;i++){
                    if(days[i]>=max){
                        max = days[i];
                        maxDay = i;
                    }
                }
            }
            System.out.println("#"+(test_case+1)+" "+money);
        }
    }
}
