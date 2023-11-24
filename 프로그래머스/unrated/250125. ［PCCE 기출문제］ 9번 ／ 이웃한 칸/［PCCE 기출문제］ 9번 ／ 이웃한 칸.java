import java.util.*;
class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;
        List<Integer> dh = new ArrayList<>();
        List<Integer> dw = new ArrayList<>();
        dh.add(0); dh.add(1); dh.add(-1); dh.add(0);
        dw.add(1); dw.add(0); dw.add(0); dw.add(-1);
        
        for(int i=0;i<4;i++){
            int h_check = h + dh.get(i);
            int w_check = w + dw.get(i);
           
            if(h_check>=0&&h_check<n&&w_check>=0&&w_check<n){          
                if(board[h][w].equals(board[h_check][w_check])){
                    count++;
                }
            }
        }
        
        return count;
    }
}