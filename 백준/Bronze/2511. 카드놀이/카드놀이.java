import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] playerA = new int[10];
        for (int i = 0; i < 10; i++) {
            playerA[i] = scanner.nextInt();
        }
        int[] playerB = new int[10];
        for (int i = 0; i < 10; i++) {
            playerB[i] = scanner.nextInt();
        }
        char[] results = new char[10];
        int scoreA = 0;
        int scoreB = 0;
        for (int i = 0; i < 10; i++) {
            if (playerA[i] > playerB[i]) {
                results[i] = 'A';
                scoreA += 3;
            } else if (playerB[i] > playerA[i]) {
                results[i] = 'B';
                scoreB += 3;
            } else {
                results[i] = 'D';
                scoreA += 1;
                scoreB += 1;
            }
        }
        System.out.println(scoreA +" "+ scoreB);
        if (scoreA > scoreB) {
            System.out.println("A");
        } else if (scoreB > scoreA) {
            System.out.println("B");
        } else {
            for (int i = 9; i >= 0; i--) {
                if (results[i] == 'A') {
                    System.out.println("A");
                    break;
                }
                else if (results[i] == 'B') {
                    System.out.println("B");
                    break;
                }
                else if(i == 0)
                	System.out.println("D");
            }
        }
        scanner.close();
    }
}