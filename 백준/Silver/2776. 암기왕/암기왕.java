import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine()); // Note1의 숫자 개수
            HashSet<Integer> note1 = new HashSet<>(); // Note1 저장할 Set

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                note1.add(Integer.parseInt(st.nextToken()));
            }

            int M = Integer.parseInt(br.readLine()); // Note2의 숫자 개수
            st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < M; i++) {
                int note2 = Integer.parseInt(st.nextToken());
                if (note1.contains(note2)) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }

            System.out.print(sb.toString());
        }
    }
}
