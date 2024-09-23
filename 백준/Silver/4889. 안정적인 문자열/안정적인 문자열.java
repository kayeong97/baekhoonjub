import java.util.Stack;
import java.util.Scanner;

public class Main {
	public int makeStack(String input) {
		Stack<Character> stack = new Stack<>();
		int result = 0;
		
		for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '{') 
                stack.push(ch);
            else if (ch == '}') {
            	if(!stack.empty()){
            		stack.pop();
            	}
            	else {
            		ch = '{';
            		stack.push(ch);
            		result += 1;
            	}
            }
		}
		result += stack.size()/2;
            
		
		return result;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main ms = new Main();
		
		int result =0;
		int counter =0;
		while(true) {
			String input = sc.nextLine();
			
			if(input.charAt(0)=='-') { 
                break;
			}
			else {
				result = ms.makeStack(input);
				counter++;
				System.out.println(counter + ". " + result);
			}
		}
		sc.close();
		
	}
}