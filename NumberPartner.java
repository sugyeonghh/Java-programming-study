// 프로그래머스 - 숫자 짝꿍

public class NumberPartner {
	public String solution(String X, String Y) {
		int[] arrX = new int[10];
		int[] arrY = new int[10];
		String result = "";

		for (String x : X.split(""))
			arrX[Integer.parseInt(x)] += 1;
		for (String y : Y.split(""))
			arrY[Integer.parseInt(y)] += 1;
		for (int i = 9; i >= 0; i--) {
			if (arrX[i] > 0 && arrY[i] > 0) {
				int min = Math.min(arrX[i], arrY[i]);
				result += String.valueOf(i).repeat(min);
				arrX[i] -= min;
				arrY[i] -= min;
			}
		}
		if (result.length() == 0) return "-1";
		else if (result.charAt(0) == '0') return "0";
		return result;
	}

	public static void main(String[] args) {
		NumberPartner numberPartner = new NumberPartner();
		System.out.println(numberPartner.solution("100", "2345"));  // -1
		System.out.println(numberPartner.solution("100", "203045"));  // 0
		System.out.println(numberPartner.solution("100", "123450"));  // 10
		System.out.println(numberPartner.solution("12321", "42531"));  // 321
		System.out.println(numberPartner.solution("5525", "1255"));  // 552
	}
}
