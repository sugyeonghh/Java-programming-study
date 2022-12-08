public class NewId {
	public String solution(String new_id) {
		String special = "~!@#$%^&*()=+[{]}:?,<>/";
		String result = "";
		new_id = new_id.toLowerCase();

		for (int i = 0; i < new_id.length(); i++) {
			String r = String.valueOf(new_id.charAt(i));
			if (!special.contains(r)) {
				if (r.equals(".")) {
					while (i + 1 < new_id.length() && new_id.charAt(i + 1) == '.') i++;
				}
				result += r;
			}
		}

		if (result.charAt(0) == '.') result = result.substring(1);
		if (result.charAt(result.length() - 1) == '.') result = result.substring(0, result.length() - 1);
		if (result.length() == 0) result = "a";
		if (result.length() >= 16) result = result.substring(0, 15);
		if (result.charAt(result.length() - 1) == '.') result = result.substring(0, result.length() - 1);
		if (result.length() <= 2) {
			while (result.length() < 3)
				result += result.charAt(result.length() - 1);
		}
//		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		NewId newId = new NewId();
//		System.out.println(newId.solution("...!@BaT#*..y.abcdefghijklm").equals("bat.y.abcdefghi"));
//		System.out.println(newId.solution("z-+.^.").equals("z--"));
		System.out.println(newId.solution("=.=").equals("aaa"));
		System.out.println(newId.solution("123_.def").equals("123_.def"));
		System.out.println(newId.solution("abcdefghijklmn.p").equals("abcdefghijklmn"));
	}
}
