import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 전체 사람 수 입력
        int N = scanner.nextInt();
        scanner.nextLine(); // 입력 스트림엔 개행 문자가 남아있으므로 비워주는 역할

        // 사람 이름 입력과 저장
        String[] names = new String[N];
        for (int i = 0; i < N; i++) {
            names[i] = scanner.nextLine();
        }

        // 첫글자가 같은 사람 수 세기 위한 맵 초기화
        Map<Character, Integer> firstLetterCount = new HashMap<>();
        for (String name : names) {
            char firstLetter = name.charAt(0);
            firstLetterCount.put(firstLetter, firstLetterCount.getOrDefault(firstLetter, 0) + 1);
        }

        // 5명 이상의 첫글자 저장
        List<Character> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : firstLetterCount.entrySet()) {
            if (entry.getValue() >= 5) {
                result.add(entry.getKey());
            }
        }

        // 6. 결과 출력
        if (result.isEmpty()) {
            System.out.println("PREDAJA");
        } else {
            Collections.sort(result);
            for (char ch : result) {
                System.out.print(ch);
            }
            System.out.println();
        }

        scanner.close();
    }
}
