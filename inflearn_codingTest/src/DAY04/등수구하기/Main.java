package DAY04.등수구하기;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    static class Student {
        int idx, score;
        public Student(int idx, int score) {
            this.idx = idx;
            this.score = score;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N,answer[];
    static Student[] arr;
    public static void solution()throws  IOException{
        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.score- o1.score;
            }
        });

        int idx=1,count=1;
        answer[arr[0].idx] = 1;
        for(int i=1;i<N;i++) {
                if(arr[i].score == arr[i-1].score) {
                    answer[arr[i].idx] = idx;
                    count+=1;
                }else {
                    answer[arr[i].idx] = idx+count;
                    idx+=count;
                    count=1;
                }
        }
        for(int n : answer) {
            bw.write(n+" ");
        }
        bw.flush();
    }

    public static void main(String[] args)throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new Student[N];
        answer= new int[N];
        st = new StringTokenizer(br.readLine());
        //기존의 인덱스를 가지고 있으면서 정렬을 진행.
        for(int i=0;i<N;i++) {
            arr[i] = new Student(i, Integer.parseInt(st.nextToken()));
        }

        solution();
    }
}
