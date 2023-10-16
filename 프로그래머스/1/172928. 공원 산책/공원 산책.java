import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        
         // 배열(산책공원)생성
        int row = park.length;
        int column = park[0].length();
        int[][] map = new int[row][column];
        int startr=0,startc = 0;
        int i=0,j=0;

        // 산책공원에 시작점, 장애물 설정
        for(String s : park){
            char[] charArray = s.toCharArray();
            for(char character : charArray){
                if(character == 'O'){
                    map[i][j] =  1;
                }
                else if(character == 'X'){
                    map[i][j] =  0;
                }
                else{
                    map[i][j] =  2;
                    startr = i;
                    startc = j;
                }
                j++;
            }
            i++;
            j=0;
        }

//        System.out.println("r="+startr+" c="+startc);

        // 로봇 이동을 위한 routes 분해 시작
        for(String route : routes){
            String[] parts = route.split(" ");

            String direction = parts[0];
            int steps = Integer.parseInt(parts[1]);

            int tempr = startr;
            int tempc = startc;
            int changestatus = 1;

            switch(direction) {
                case "E":
                    for(int p=1;p<=steps;p++){
                        if(startc+p>=column||map[startr][startc+p] == 0){
                            startc = tempc;
                            changestatus = 0;
                            break;
                        }
                    }
                    if(changestatus == 1) {
                        startc = startc+steps;
                    }
                    continue;
                case "W":
                    for(int p=1;p<=steps;p++){
                        if(startc-p<0||map[startr][startc-p] == 0){
                            startc = tempc;
                            changestatus = 0;
                            break;
                        }
                    }
                    if(changestatus == 1) {
                        startc = startc-steps;
                    }
                    continue;
                case "S":
                    for(int p=1;p<=steps;p++){
                        if(startr+p>=row||map[startr+p][startc] == 0){
                            startr = tempr;
                            changestatus = 0;
                            break;
                        }
                    }
                    if(changestatus == 1) {
                        startr = startr+steps;
                    }
                    continue;
                case "N":
                    for(int p=1;p<=steps;p++){
                        if(startr-p<0||map[startr-p][startc] == 0){
                            startr = tempr;
                            changestatus = 0;
                            break;
                        }
                    }
                    if(changestatus == 1) {
                        startr = startr-steps;
                    }
                    continue;
                default:
                    continue;
            }

        }
        int[] answer = {startr,startc};
        return answer;
    }
}