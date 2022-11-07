// 프로그래머스 - 가운데 글자 가져오기
/* 풀이)
 * 1. 문자열의 길이 len와 중간 인덱스 mid 저장
 * 2. 문자열의 길이가 홀수이면 mid인덱스 값
 * 3. 문자열의 길이가 짝수이면 (mid-1)인덱스 값부터 2개
 * */

public class GetMiddleLetter {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        int mid = len / 2;
        if (len % 2 == 1)
            answer += s.charAt(mid);
        else
            answer += s.substring(mid-1, mid+1);
        return answer;
    }

    public static void main(String[] args) {
        GetMiddleLetter getMiddleLetter = new GetMiddleLetter();
        String[] input2 = {"abcde", "qwer"};
        String[] result2 = {"c", "we"};
        System.out.println("가운데 글자 가져오기");
        for (int i = 0; i < input2.length; i++) {
            System.out.printf("example %d", i+1);
            System.out.println("=".repeat(20));
            System.out.println("input: " + input2[i]);
            System.out.println("correct: " + result2[i]);
            System.out.println("my answer: " + getMiddleLetter.solution(input2[i]));
        }
    }
}
