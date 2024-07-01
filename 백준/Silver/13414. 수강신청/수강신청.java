import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);
        Map<String,Integer> hashMap = new HashMap<>();

        for(int i=0;i<k;i++){
            hashMap.put(br.readLine(),i);
        }

        List<String> keySet = new ArrayList<>(hashMap.keySet());
        keySet.sort(Comparator.comparing(hashMap::get));
        
        if(keySet.size()<n){
            for(int i=0;i<keySet.size();i++){
                System.out.println(keySet.get(i));
            }
        }else {
            for(int i=0;i<n;i++){
                System.out.println(keySet.get(i));
            }    
        }
    }
}
