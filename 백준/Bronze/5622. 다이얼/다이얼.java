import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int result=0;
        for(int i =0; i<s.length(); i++){
            if((s.charAt(i)=='A')|(s.charAt(i)=='B')|(s.charAt(i)=='C')){
                result += 3;
            } else if ((s.charAt(i)=='D')|(s.charAt(i)=='E')|(s.charAt(i)=='F')) {
                result +=4;
            }else if ((s.charAt(i)=='G')|(s.charAt(i)=='H')|(s.charAt(i)=='I')) {
                result +=5;
            }else if ((s.charAt(i)=='J')|(s.charAt(i)=='K')|(s.charAt(i)=='L')) {
                result +=6;
            }else if ((s.charAt(i)=='M')|(s.charAt(i)=='N')|(s.charAt(i)=='O')) {
                result +=7;
            }else if ((s.charAt(i)=='P')|(s.charAt(i)=='Q')|(s.charAt(i)=='R')|(s.charAt(i)=='S')) {
                result +=8;
            }else if ((s.charAt(i)=='T')|(s.charAt(i)=='U')|(s.charAt(i)=='V')) {
                result +=9;
            }else if ((s.charAt(i)=='W')|(s.charAt(i)=='X')|(s.charAt(i)=='Y')|(s.charAt(i)=='Z')) {
                result +=10;
            }
        }
        System.out.println(result);
    }
}
