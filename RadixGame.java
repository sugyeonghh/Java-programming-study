public class RadixGame {
    public String solution(int n, int t, int m, int p) {
        String numbers = "";
        String result = "";

        for (int i = 0; i <= t * m; i++) {
            numbers += Integer.toString(i, n);
        }

        for (int i = 0; i < t * m; i += m) {
            char word = numbers.charAt(i + p - 1);
            if (Character.isAlphabetic(word)) word = Character.toUpperCase(word);
            result += word;
        }

        return result;
    }

    public static void main(String[] args) {
        RadixGame radixGame = new RadixGame();
        System.out.println(radixGame.solution(2, 4, 2, 1));
        System.out.println(radixGame.solution(16, 16, 2, 1));
        System.out.println(radixGame.solution(16, 16, 2, 2));
    }
}
