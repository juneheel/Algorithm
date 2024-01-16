import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        String[][] arr = new String[5][15];
        String[] splitLine;

        for(int i=0;i<5;i++){
            if(i==0) {
                splitLine = line.split("");
            }else{
                line = br.readLine();
                splitLine = line.split("");
            }

            for(int j=0;j<splitLine.length;j++) {
                arr[i][j] = splitLine[j];
            }

        }

        StringBuilder result= new StringBuilder();
        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(arr[j][i]==(null)) continue;
                result.append(arr[j][i]);
            }
        }

        System.out.println(result);
    }
}


