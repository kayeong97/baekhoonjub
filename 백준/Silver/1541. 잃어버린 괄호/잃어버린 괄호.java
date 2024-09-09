import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        int currentNumber = 0;
        int totalSum = 0;
        boolean firstMinus = false;
        for (char ch : expression.toCharArray()) {
            if (Character.isDigit(ch))
                currentNumber = currentNumber * 10 + (ch - '0');
            else if (ch == '+' || ch == '-') {
                if (firstMinus) 
                    totalSum -= currentNumber;
                else
                	totalSum += currentNumber;
                currentNumber = 0;
                if (ch == '-') firstMinus = true;
            }
        }
        if (firstMinus) {
            totalSum -= currentNumber;
        } else {
            totalSum += currentNumber;
        }
        System.out.println(totalSum);
        scanner.close();
	}
}
