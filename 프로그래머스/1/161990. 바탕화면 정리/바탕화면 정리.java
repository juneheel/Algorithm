import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
      
        int[][] screen = new int[wallpaper.length+1][wallpaper[0].length()+1];
        
        int xMin=50,yMin=50,xMax=0,yMax=0;
        int i=0;
        
        for(String r:wallpaper){
            char[] contents = r.toCharArray();
            for(int j=0;j<contents.length;j++){
                if(contents[j]=='#'){
                    System.out.printf("%d %d ",i,j); // i=1 j=0
                    
                        if(i<xMin){
                            
                            xMin = i;
                        }
                        if(i+1>xMax){
                            
                            xMax = i+1;
                        }
                    
                    
                        if(j<yMin){
                            
                            yMin = j;
                        }
                        if(j+1>yMax){
                           
                            yMax = j+1;
                        }
                    }
                
                else{
                    continue;
                }
            }
            i++;
        }
        
        int[] result = {xMin,yMin,xMax,yMax};
        int[] answer = result;
        return answer;
    }
}