import java.util.Scanner;

class Solution {
    public static int solution(int n, int a, int b) {

        int answer = 0;
        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = solution(n, a, b);
        System.out.println(result);
    }

}