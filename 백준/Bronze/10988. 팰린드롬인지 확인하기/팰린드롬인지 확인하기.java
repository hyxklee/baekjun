import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int result =0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(s.length()-i-1)){

            }
            else {
                result = 0;
                break;
            }
            result = 1;
        }
        System.out.println(result);
    }
}