import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        
        int question = answers.length;
        
        int[] student1 = new int[answers.length];
        int[] student2 = new int[answers.length];
        int[] student3 = new int[answers.length];
        int max= Integer.MIN_VALUE;
        
        int[] count=new int[3];
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0;i<question;i++){
                student1[i] = (i)%5+1;
            
            if(i%2==0){
                student2[i] = 2;   
            }else{
                if(i%8==1){
                    student2[i] = 1;
                }else if(i%8 == 3){
                    student2[i] = 3;
                }else if(i%8 == 5){
                    student2[i] = 4;
                }else
                    student2[i] = 5;
            }
            
            switch(i%10){
                case 0 : student3[i] = 3;
            break;
                case 1 : student3[i] = 3;
            break;
                case 2 : student3[i] = 1;
            break;
                case 3 : student3[i] = 1;
            break;
                case 4 : student3[i] = 2;
            break;
                case 5 : student3[i] = 2;
            break;
                case 6 : student3[i] = 4;
            break;
                case 7 : student3[i] = 4;
            break;
                case 8 : student3[i] = 5;
            break;
                case 9 : student3[i] = 5;
            break;
            default:
                student3[i] = 3;
                break;
            }
        }
            
            for(int i=0;i<question;i++){
                if(answers[i]==student1[i]){
                    count[0]++;
                }
                if(answers[i]==student2[i]){
                    count[1]++;
                }
                if(answers[i]==student3[i]){
                    count[2]++;                 
                }
            }
        
        for(int c : count){
            System.out.println(c);
        }
        
         for(int i=0;i<count.length;i++){
            if(count[i]>max){
                max = count[i];
                answer.clear();
                answer.add(i+1);
            }else if(count[i]==max){
                answer.add(i+1);
            }
        }        
            return answer;
    }
}