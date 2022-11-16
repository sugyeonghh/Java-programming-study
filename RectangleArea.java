// 프로그래머스 - 직사각형 넓이 구하기

public class RectangleArea {
    public int solution(int[][] dots) {
        int x, y;
        int width = 0, height = 0;

        x = dots[0][0];
        y = dots[0][1];
        for (int i = 1; i < 4; i++) {
            if (x != dots[i][0]) width = Math.abs(x - dots[i][0]);
            if (y != dots[i][1]) height = Math.abs(y - dots[i][1]);
        }
        return width * height;
    }

    public static void main(String[] args) {
        RectangleArea rectangleArea = new RectangleArea();
        System.out.println(rectangleArea.solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}));    // 1
        System.out.println(rectangleArea.solution(new int[][]{{-1, 1}, {1, 1}, {1, -1}, {-1, 1}})); // 4
    }
}
