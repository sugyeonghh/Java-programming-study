// 프로그래머스 - JadenCase 문자열 만들기

public class JadenCaseString {
	public String solution(String s) {
		String result = "";
		char[] arr = s.toLowerCase().toCharArray();

		result += Character.toUpperCase(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == ' ') result += Character.toUpperCase(arr[i]);
			else result += arr[i];
		}
		return result;
	}

	public static void main(String[] args) {
		JadenCaseString jadenCaseString = new JadenCaseString();
		System.out.println(jadenCaseString.solution("3people unFollowed me")); // "3people Unfollowed Me"
	}
}
