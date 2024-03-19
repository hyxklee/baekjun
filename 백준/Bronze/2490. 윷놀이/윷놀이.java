import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int k = 0; k<3; k++){
            String s = br.readLine();

            String[] arr = s.split(" ");
            int result = 0;
            for (String string : arr) {
                result = result + (Integer.parseInt(string));
            }
            switch (result) {
                case 0:
                    System.out.println("D");
                    break;
                case 1:
                    System.out.println("C");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("A");
                    break;
                case 4:
                    System.out.println("E");
                    break;
                default:
                    break;
            }
        }
    }
}