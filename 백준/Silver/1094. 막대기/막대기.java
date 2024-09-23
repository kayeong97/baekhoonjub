import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int X = scanner.nextInt();
        String binaryString = Integer.toBinaryString(X);

        int countOnes = 0;
        for (char bit : binaryString.toCharArray()) {
            if (bit == '1') {
                countOnes++;
            }
        }
        System.out.println(countOnes);

        scanner.close();
    }
}
