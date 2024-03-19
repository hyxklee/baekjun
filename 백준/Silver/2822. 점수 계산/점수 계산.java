import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[8];
        int[] arr2 = new int[8];
        for (int i =0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            arr2[i] = arr[i];
        }
        Arrays.sort(arr);
        int result = 0;
        for (int i = 3; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println(result);
        for(int i = 0;i<8; i++){

            for(int j = 3; j<8; j++){
                if(arr2[i]==arr[j]){
                    System.out.print((i+1)+" ");
                }
            }
        }
    }
}