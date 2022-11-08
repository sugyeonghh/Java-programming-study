// 수박수박수박수박수박수?

public class Watermelon {
    public String solution(int n) {
        String word = "수박";
        if (n <= 2) return word.substring(0, n);

        String answer = word.repeat(n/2);
        if (n % 2 == 1) answer += word.substring(0, 1);
        return answer;
    }

    public static void main(String[] args) {
        Watermelon watermelon = new Watermelon();
        System.out.println("n이 3인 경우: " + watermelon.solution(3));
        System.out.println("n이 4인 경우: " + watermelon.solution(4));
    }
}
