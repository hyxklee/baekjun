import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = new String[s.length()];
        for(int i = 0; i<s.length(); i++){
            arr[i] = s.substring(i,s.length());
        }
        Arrays.sort(arr);
        for(int i = 0; i<s.length(); i++){
            System.out.println(arr[i]);
        }
    }
}