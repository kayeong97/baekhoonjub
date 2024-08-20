import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		
		int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            String inputLine = sc.nextLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = inputLine.charAt(j) - '0';
            }
        }
		int L = (N<M) ? N : M;
		int square = 1;
		
		for(int i = 1; i < L; i++){
			for (int j = 0; j < N - i; j++){ 
				for (int k = 0; k < M - i; k++)
					if(arr[j][k] == arr[j][k+i] && arr[j][k] == arr[j+i][k] && arr[j][k] == arr[j+i][k+i])
					square = (i+1)*(i+1);
			}
		}
		System.out.print(square);
		sc.close();
	}
}