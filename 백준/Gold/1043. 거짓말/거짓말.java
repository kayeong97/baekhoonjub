import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        
        boolean[] knowTruth = new boolean[N];
        int index = sc.nextInt();
        for (int i = 0; i < index; i++) {
            int knowTruthMan = sc.nextInt();
            knowTruth[knowTruthMan - 1] = true; // 진실을 아는 사람들을 표시
        }
        
        // 모든 파티의 사람들 정보를 저장할 리스트
        ArrayList<int[]> partyList = new ArrayList<>();
        
        // 각 파티의 정보를 입력받고 리스트에 저장
        for (int j = 0; j < M; j++) {
            int partySize = sc.nextInt();
            int[] numbers = new int[partySize];
            
            for (int i = 0; i < partySize; i++) {
                numbers[i] = sc.nextInt() - 1; // 인덱스에 맞게 -1
            }
            partyList.add(numbers);
        }

        // 진실이 퍼질 수 있는 모든 파티를 반복적으로 체크
        boolean changed;
        do {
            changed = false;
            for (int[] party : partyList) {
                boolean partyHasTruth = false;
                // 파티에 진실을 아는 사람이 있는지 확인
                for (int person : party) {
                    if (knowTruth[person]) {
                        partyHasTruth = true;
                        break;
                    }
                }
                // 진실을 아는 사람이 있다면, 그 파티의 모든 사람에게 진실이 퍼짐
                if (partyHasTruth) {
                    for (int person : party) {
                        if (!knowTruth[person]) {
                            knowTruth[person] = true;
                            changed = true;
                        }
                    }
                }
            }
        } while (changed);

        // 거짓말해도 되는 파티 수 계산
        int counts = 0;
        for (int[] party : partyList) {
            boolean partyHasTruth = false;
            // 파티에 진실을 아는 사람이 있는지 확인
            for (int person : party) {
                if (knowTruth[person]) {
                    partyHasTruth = true;
                    break;
                }
            }
            // 진실을 아는 사람이 없는 파티만 카운트
            if (!partyHasTruth) {
                counts++;
            }
        }

        System.out.println(counts);
        sc.close();
    }
}