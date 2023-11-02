import java.util.*;

class Solution {
    private static class Point{ // 교점을 위한 클래스 생성
        public final long x,y;
        private Point(long x, long y){
            this.x = x;
            this.y = y;
        }
    }
 
    private static Point crossPoint(long a,long b,long e,long c,long d,long f){ // 교점구하는 메서드
        double cpX = (double) (b*f - e*d)/(a*d - b*c);
        double cpY = (double) (e*c - a*f)/(a*d - b*c);
        
        if(cpX%1 !=0||cpY%1 !=0) return null; // 소숫점이나오면 null 반환 - 정수만 반환되도록
        
        return new Point((long)cpX,(long)cpY);
    }
    
    private Point getMinimumPoint(List<Point> points){
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;
        
        for(Point p : points){
            if(p.x<x) x = p.x;
            if(p.y<y) y = p.y;
        }
        
        return new Point(x,y);
    }
    
    private Point getMaximumPoint(List<Point> points){
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        
        for(Point p : points){
            if(p.x>x) x = p.x;
            if(p.y>y) y = p.y;
        }
        
        return new Point(x,y);
    }
    
       public String[] solution(int[][] line) {
           List<Point> points = new ArrayList<>();
           for(int i=0;i<line.length;i++){
               for(int j=i+1;j<line.length;j++){
                   Point crossPoint = crossPoint(line[i][0],line[i][1],line[i][2],line[j][0],line[j][1],line[j][2]);
                   
                   if(crossPoint != null){
                       points.add(crossPoint);
                   }
               }
           }
           
           Point minimum = getMinimumPoint(points);
           Point maximum = getMaximumPoint(points);
           
           int width = (int)(maximum.x-minimum.x+1);
           int height = (int)(maximum.y-minimum.y+1);
           
           char[][] arr = new char[height][width];
           for(char[] row : arr){
               Arrays.fill(row,'.');
           }
           
           for(Point p : points){
               int x = (int) (p.x-minimum.x);
               int y = (int) (maximum.y-p.y);
               arr[y][x] = '*';
           }
           
        String[] result = new String[arr.length];
           for(int i=0;i<result.length;i++){
               result[i] = new String(arr[i]);
           }
        return result;
    }
}