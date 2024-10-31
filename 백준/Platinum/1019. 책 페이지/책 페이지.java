import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();  // 입력 숫자가 매우 클 수 있으므로 long 타입 사용
        long[] counts = new long[10];
        
        long start = 1;
        long point = 1;
        
        while (start <= n) {
            // 끝 자릿수가 9가 되도록 n을 조정하며 해당 범위 숫자 개수 세기
            while (n % 10 != 9 && start <= n) {
                countDigits(n, counts, point);
                n--;
            }
            if (n < start) break;
            
            // 시작 자릿수가 0이 되도록 start를 조정하며 해당 범위 숫자 개수 세기
            while (start % 10 != 0 && start <= n) {
                countDigits(start, counts, point);
                start++;
            }
            
            // 각 자릿수의 숫자 개수를 한 번에 더하기
            long range = (n / 10 - start / 10 + 1);
            for (int i = 0; i < 10; i++) {
                counts[i] += range * point;
            }
            
            start /= 10;
            n /= 10;
            point *= 10;
        }
        
        for (long count : counts) {
            System.out.print(count + " ");
        }
    }
    
    private static void countDigits(long num, long[] counts, long point) {
        while (num > 0) {
            counts[(int) (num % 10)] += point;
            num /= 10;
        }
    }
}
