class Solution {
    public int solution(int[][] sizes) {
        int maxRow = 0;
        int maxLength= 0;
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]<sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=temp;
            }
        }
        
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]>maxRow){
                maxRow = sizes[i][0];
            }
            if(sizes[i][1]>maxLength){
                maxLength = sizes[i][1];
            }
        }
        System.out.println(maxRow+","+maxLength);
        int answer = maxRow*maxLength;
        return answer;
    }
}