import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] targets = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            targets[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> deque = new LinkedList<>();

        for(int i=1;i<=n;i++){
            deque.add(i);
        }

        int move =0;
        // 앞이빠른지 뒤가빠른지 판정


        for(int target : targets){
            int front =0,back =0;
            Iterator<Integer> listIterator = deque.iterator();
            Iterator<Integer> descIterator = deque.descendingIterator();
//            System.out.println(listIterator.next());
//            System.out.println(descIterator.next());
            while(listIterator.next()!=target){
                front++;
            }
            back = deque.size()-front;
//            System.out.println(front+" "+back);
//            while(descIterator.next()!=target){
//                back++;
//            }
            if(front>=back){
                while(deque.peek()!=target){
                    deque.addFirst(deque.pollLast());
                    move++;
                }int result = deque.poll();
//                System.out.println("제거 : "+result);
            }else{
                while(deque.peek()!=target){

                    deque.add(deque.poll());
                    move++;
                }int result = deque.poll();
//                System.out.println("제거 : "+result);
            }

//            System.out.println(deque);
//            System.out.println("결과"+move);

        }
        System.out.println(move);
    }
}
