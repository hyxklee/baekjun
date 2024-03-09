import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = 1;
        int q = 1;
        int r = 2;
        int b = 2;
        int kn = 2;
        int p = 8;

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
        k = k-Integer.parseInt(stringTokenizer.nextToken());
        q = q-Integer.parseInt(stringTokenizer.nextToken());
        r = r-Integer.parseInt(stringTokenizer.nextToken());
        b = b-Integer.parseInt(stringTokenizer.nextToken());
        kn = kn-Integer.parseInt(stringTokenizer.nextToken());
        p = p-Integer.parseInt(stringTokenizer.nextToken());

        System.out.print(k + " ");
        System.out.print(q + " ");
        System.out.print(r + " ");
        System.out.print(b + " ");
        System.out.print(kn + " ");
        System.out.print(p + " ");
    }
}