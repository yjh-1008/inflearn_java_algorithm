package DAY01.보이는학생;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //문제 : 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때,
    // 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않는다.)
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, numberList[], answer=1, maxHeight;
    public static void main(String[] args)throws Exception {
        N = Integer.parseInt(br.readLine());
        numberList = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int n = 0 ; n < N; n++) {
            numberList[n] = Integer.parseInt(st.nextToken());
        }

        maxHeight = numberList[0];
        //for문을 반복해서 가장 키가 큰 학생을 저장.
        for(int n = 1; n < N; n++) {
            //그 학생보다 키가 더 크다면 1 추가한 후, 그 학생의 키를 저장.
            if(numberList[n] > maxHeight) {
                answer++;
                maxHeight = numberList[n];
            }
        }

        System.out.print(answer);
    }
}
