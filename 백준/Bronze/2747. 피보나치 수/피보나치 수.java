import java.util.Scanner;

public class Main {
    static int[] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        memo = new int[n + 1]; // 메모이제이션을 위한 배열 초기화
        int result = fibonacci(n);
        System.out.println(result);
    }

    public static int fibonacci(int n) {
        if (memo[n] != 0) {
            return memo[n]; // 이미 계산된 값이라면 바로 반환
        }

        if (n <= 1) {
            return n;
        }

        memo[n] = fibonacci(n - 1) + fibonacci(n - 2); // 계산 결과를 메모이제이션
        return memo[n];
    }
}
