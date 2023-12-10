import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[][] plansArr) {
        Plan[] plans = new Plan[plansArr.length];
        for(int i = 0; i < plansArr.length; i++) {
            plans[i] = new Plan(plansArr[i][0],plansArr[i][1],plansArr[i][2]);
        }
        Arrays.sort(plans, (a, b) -> a.start - b.start); 

        Stack<Plan> stop = new Stack<>();
        List<String> answer = new ArrayList<>();
        for(int i = 0; i < plans.length - 1; i++) {
            Plan curPlan = plans[i];
            Plan nextPlan = plans[i + 1];

            if(curPlan.getEndTime() > nextPlan.start) { // 종료시간이 다음 시작시간보다 크면
                curPlan.playTime = curPlan.getEndTime() - nextPlan.start; // playTime에 남은 시간 저장
                stop.push(curPlan); // 스택에 저장
                continue; // 다음 과제 시작
            }
            
            answer.add(curPlan.name); // 종료시간 다음시작시간보다 작으면 정답에 추가

            int restTime = nextPlan.start - curPlan.getEndTime(); // 자투리시간 = 일이 마무리되고 다음시작시간까지 남은 시간 
            System.out.println(restTime);
            
            
            while(restTime > 0 && !stop.isEmpty()) { // 자투리시간이 존재하고 , 스택이 비어있지않다면
                Plan stoppedPlan = stop.peek(); // 스택에서 하던일을 꺼내오고
                int timeDiff = stoppedPlan.playTime - restTime; // 시간차 = 완료까지남은시간 - 자투리시간
                stoppedPlan.playTime = timeDiff;
                restTime = timeDiff * -1;
                if(timeDiff > 0) break; // 자투리시간다써도 해결이안되면 다음 할일 넣기
                answer.add(stop.pop().name); // 해결되면 정답에 추가
            }
        }

        answer.add(plans[plans.length - 1].name); // 마지막 index의 plan 처리
        while(!stop.isEmpty()) answer.add(stop.pop().name); // stack에 남아있던 plan들 넣기
        return answer.toArray(new String[answer.size()]);
    }
}

class Plan {
    String name;
    int start;
    int playTime;

    public Plan(String name, String start, String playTime) {
        this.name = name;
        String[] time = start.split(":");
        this.start = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]); // 시간 * 60 + 분
        this.playTime = Integer.parseInt(playTime);
    }

    public int getEndTime() {
        return start + playTime;
    }
}