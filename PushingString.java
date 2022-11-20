public class PushingString {
    public int solution(String A, String B) {
        String tmp = B.repeat(2);
        return tmp.indexOf(A);
    }

    public static void main(String[] args) {
        PushingString pushingString = new PushingString();
        System.out.println(pushingString.solution("hello", "ohell"));   // 1
        System.out.println(pushingString.solution("apple", "elppa"));   // -1
    }
}
