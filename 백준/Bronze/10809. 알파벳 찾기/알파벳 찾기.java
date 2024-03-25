import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(arr[ch-97] == -1){
                arr[ch-97] = i;
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}