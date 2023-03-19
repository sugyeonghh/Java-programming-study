// 프로그래머스 - 주식 가격

import java.util.Arrays;

public class StockPrice {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = i + 1; j < len; j++) {
                count++;
                if (prices[i] > prices[j]) break;
            }
            result[i] = count;
        }

        return result;
    }

    public static void main(String[] args) {
        StockPrice stockPrice = new StockPrice();
        System.out.println(Arrays.toString(stockPrice.solution(new int[]{1, 2, 3, 2, 3})));
    }
}
