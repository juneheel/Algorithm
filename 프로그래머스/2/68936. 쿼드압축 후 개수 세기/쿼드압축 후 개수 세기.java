class Solution {
    static int[] answer = new int[2];
    public int[] solution(int[][] arr) {
        zip(0,0,arr.length,arr);
        return answer;
    }
    public static void zip(int x, int y,int r,int[][] arr){
        if(check(x,y,r,arr)){
            answer[arr[x][y]]++;
            return ;
        }
        int half = r/2;
        zip(x,y,half,arr);
        zip(x+half,y,half,arr);
        zip(x,y+half,half,arr);
        zip(x+half,y+half,half,arr);
    }
    public static boolean check(int x, int y,int r,int[][] arr){
        int compare = arr[x][y];
        for(int i=x;i<x+r;i++){
            for(int j=y;j<y+r;j++){
                if(compare != arr[i][j]){
                    return false;
                }   
            }
        }
        return true;
    }
}