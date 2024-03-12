class Solution {
    public int solution(String[] board) {
        boolean result = test(board);
        if(result == true) {
            return 1;
        }else{
            return 0;
        }
    }
    private static boolean test(String[] board){
        int oCount =0;
        int xCount =0;
        int count=0;
        String[] words = new String[(int) Math.pow(board.length,2)];

        for(String b: board){
            String[] word = b.split("");
            for(String w : word){
                words[count++] = w;
            }
        }
        for(String w : words){
            if(w.equals("O")){
                oCount++;
            }
            if(w.equals("X")) {
                xCount++;
            }
        }
       if(oCount<xCount) return false;
       if(oCount-xCount>=2) return false;
        
        for(int i=0;i<3;i++){
            if(words[3*i].equals("O")&&words[3*i+1].equals("O")&&words[3*i+2].equals("O")&&oCount-xCount!=1){
                return false;
            }
            if(words[3*i].equals("X")&&words[3*i+1].equals("X")&&words[3*i+2].equals("X")&&oCount>xCount){
                return false;
            }
        }
            for(int i=0;i<3;i++){
            if(words[i].equals("O")&&words[i+3].equals("O")&&words[i+6].equals("O")&&oCount-xCount!=1){
                return false;
            }
            if(words[i].equals("X")&&words[i+3].equals("X")&&words[i+6].equals("X")&&oCount>xCount){
                return false;
            }
        }

        if(words[0].equals("O")&&words[4].equals("O")&&words[8].equals("O")&&oCount-xCount!=1){
            return false;
        }
        if(words[0].equals("X")&&words[4].equals("X")&&words[8].equals("X")&&oCount>xCount){
            return false;
        }
        if(words[2].equals("O")&&words[4].equals("O")&&words[6].equals("O")&&oCount-xCount!=1){
            return false;
        }
        if(words[2].equals("X")&&words[4].equals("X")&&words[6].equals("X")&&oCount>xCount){
            return false;
        }
        return true;
    }

}