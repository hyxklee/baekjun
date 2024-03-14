import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            boolean y = false;
            if (s.equals("0")) {
                break;
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {

                } else {
                    y = false;
                    break;
                }
                y = true;
            }
            if(y == true){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
