import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        while(true) {
            String s = br.readLine();
            if(s.equals("#")){
                break;
            }
            s = s.toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                 switch (s.charAt(i)){
                     case 'a':
                     case 'e':
                     case 'i':
                     case 'o':
                     case 'u':
                         result++;
                     default:
                         break;

                 }

            }
            System.out.println(result);
            result = 0;
        }
    }
}