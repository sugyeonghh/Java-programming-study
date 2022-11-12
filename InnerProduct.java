// 프로그래머스 - 내적

public class InnerProduct {
    public int solution(int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i] * b[i];
        return sum;
    }

    public static void main(String[] args) {
        InnerProduct innerProduct = new InnerProduct();

        System.out.println(innerProduct.solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2}));
        System.out.println(innerProduct.solution(new int[]{-1, 0, 1}, new int[]{1, 0, -1}));
    }
}
