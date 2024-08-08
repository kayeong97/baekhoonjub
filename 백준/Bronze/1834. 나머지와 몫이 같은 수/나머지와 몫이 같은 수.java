import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. N 입력 받기
        long N = scanner.nextInt();
        scanner.close();

        // 합을 저장할 변수 초기화
        long sum = 0;

        // 2. 반복문을 돌리면서 합에 더함
        for (int i = 1; i < N; i++) {
        	sum += N * i + i;
        }

        // 3. 합 출력
        System.out.println(sum);
    }
}
