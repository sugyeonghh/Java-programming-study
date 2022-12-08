// 프로그래머스 - 신규 아이디 추천

public class NewId {
	public String solution(String new_id) {
		String result = new_id.toLowerCase();
		result = result.replaceAll("[^-_.a-z0-9]", "");
		result = result.replaceAll("[.]+", ".");
		result = result.replaceAll("^[.]|[.]$", "");

		if (result.isEmpty()) result += "a";
		if (result.length() > 15) {
			result = result.substring(0, 15);
			result = result.replaceAll("[.]$", "");
		}
		if (result.length() <= 2) {
			result += String.valueOf(result.charAt(result.length() - 1)).repeat(3 - result.length());
		}
		return result;
	}

	public static void main(String[] args) {
		NewId newId = new NewId();
		System.out.println(newId.solution("...!@BaT#*..y.abcdefghijklm.").equals("bat.y.abcdefghi"));
		System.out.println(newId.solution("z-+.^.").equals("z--"));
		System.out.println(newId.solution("=.=").equals("aaa"));
		System.out.println(newId.solution("123_.def").equals("123_.def"));
		System.out.println(newId.solution("abcdefghijklmn.p").equals("abcdefghijklmn"));
	}
}
