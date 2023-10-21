import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
       Map<String, Integer> termMap = new HashMap<>();
         List<Integer> answers = new ArrayList();
        for (String term : terms) {
            String word[] = term.split(" ");
            termMap.put(word[0], Integer.parseInt(word[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String privacie[] = privacies[i].split(" ");
            // privacies에서 추출한 Date
            System.out.println("test" + termMap.get(privacie[1]));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
            LocalDate expiredCheckDate = LocalDate.parse(privacie[0], formatter);

            LocalDate newDate = expiredCheckDate.plusMonths(termMap.get(privacie[1]));
            System.out.println("만료계산날짜"+newDate);
            

            LocalDate todayDate = LocalDate.parse(today, formatter);
            System.out.println("주어진날짜"+todayDate);
            if (newDate.compareTo(todayDate) <= 0) {
                answers.add(i+1);
            }
        }
        // Integer wrapper class를 사용한 list를 array로 변환
        int[] answer = answers.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}