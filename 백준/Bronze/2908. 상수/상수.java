import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();


        StringBuffer stringBuffer = new StringBuffer(a);
        String ss = stringBuffer.reverse().toString();
        stringBuffer = new StringBuffer(b);
        String sss = stringBuffer.reverse().toString();

        int aa = Integer.parseInt(ss);
        int bb = Integer.parseInt(sss);

        int result = 0;
        if(aa>bb){
            result = aa;
        }
        else{
            result = bb;
        }
        System.out.println(result);

    }
}
