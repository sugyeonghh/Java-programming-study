// 프로그래머스 - 다항식 더하기

public class PolynomialAddition {
	public String solution(String polynomial) {
		int coef = 0;   // 계수
		int cons = 0;   // 상수
		for (String p : polynomial.split(" ")) {
			if (p.contains("x")) coef += p.equals("x") ? 1 : Integer.parseInt(p.substring(0, p.length() - 1));
			else if (!p.equals("+")) cons += Integer.parseInt(p);
		}
		String coefStr = coef > 0 ? coef == 1 ? "x" : coef + "x" : "";
		String consStr = cons > 0 ? String.valueOf(cons) : "";
		String result = "";
		if (coef > 0) {
			if (cons > 0) result += coefStr + " + " + consStr;
			else result += coefStr;
		}
		else if (cons > 0) result += consStr;
		return result;
	}

	public static void main(String[] args) {
		PolynomialAddition polynomialAddition = new PolynomialAddition();
		System.out.println(polynomialAddition.solution("3x + 7 + x"));  // 4x + 7
		System.out.println(polynomialAddition.solution("x + x + x"));  // 3x
	}
}
