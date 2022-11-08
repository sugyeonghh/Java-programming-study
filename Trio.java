// 삼총사

public class Trio {
    public int solution(int[] number) {
        int answer = 0;
        int len = number.length;
        for (int i = 0; i < len - 2; i++)
            for (int j = i + 1; j < len - 1; j++)
                for (int k = j + 1; k < len; k++)
                    answer += (number[i] + number[j] + number[k] == 0) ? 1 : 0;
        return answer;
    }

    public static void main(String[] args) {
        Trio trio = new Trio();
        System.out.println("number: [-2, 3, 0, 2, -5], result: " + trio.solution(new int[]{-2, 3, 0, 2, -5}));
        System.out.println("number: [-3, -2, -1, 0, 1, 2, 3], result: " + trio.solution(new int[]{-3, -2, -1, 0, 1, 2, 3}));
        System.out.println("number: [-1, 1, -1, 1], result: " + trio.solution(new int[]{-1, 1, -1, 1}));
    }
}
