import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int min = Math.abs(A-B);//절댓값 계산해줌
        
        int Size =sc.nextInt();
        for (int i = 0; i < Size; i++) {
        	int N = sc.nextInt();
            int controlBN = Math.abs(B-N);
            if(controlBN+1 < min) min = controlBN+1;
        }
        System.out.println(min);
        sc.close();
    }
}
