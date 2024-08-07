import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		        
		while (true) {
		    int day = scanner.nextInt();
		    int month = scanner.nextInt();
		    int year = scanner.nextInt();
		            
		    // 0 0 0 입력시 종료
		    if (day == 0 && month == 0 && year == 0) break;
		    if (year < 1700 && year > 2200) continue;
		    
		    // 각각 달 배열 생성
		    int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		    
		    // 윤년인지 체크
		    if (isLeapYear(year)) { daysInMonth[1] = 29;} // 윤년의 2월은 29일까지 있음 
		            
		    // 1월 1일부터 계산
		    int dayOfYear = day;
		    for (int i = 0; i < month - 1; i++) {
		    	dayOfYear += daysInMonth[i];
		    }
		            
		    System.out.println(dayOfYear);
		}
		        
		    scanner.close();
		}
		    
		// Method to check if a year is a leap year
		private static boolean isLeapYear(int year) {
			if (year % 4 == 0) {
				if (year % 100 == 0) return year % 400 == 0;
				else return true;
		        }
		        return false;
		    }

	}
