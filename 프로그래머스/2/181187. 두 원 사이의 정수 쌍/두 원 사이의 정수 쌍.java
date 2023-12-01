class Solution {
    public long solution(int r1, int r2) {
        // 원이니까 1사분면만구해서 *4하면됨
        // Y축 혹은 X축의 개수를 구하면되므로 R*R = X*X + Y*Y; 식을 이용한다.
        // 즉 y*y = r*r-x*x;
        // 제곱은 Math.pow(길이,원하는제곱수); 제곱근은 Math.sqrt();를 통해 구한다.
       long answer = 0;
 
      for( int i = 1; i <= r2 ; i++){
            double y2 = Math.sqrt(Math.pow(r2,2) - Math.pow(i,2));
            double y1 = Math.sqrt(Math.pow(r1,2) - Math.pow(i,2));
            answer += ( (long)y2 - (long)Math.ceil(y1) + 1);
        }
        answer *= 4;
        
        return answer;
    }
}