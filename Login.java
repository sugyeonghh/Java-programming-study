// 프로그래머스 - 로그인 성공?

import java.util.HashMap;

public class Login {
	public String solution(String[] id_pw, String[][] db) {
		HashMap<String, String> dbMap = new HashMap<>();
		for (String[] dbList : db) {
			dbMap.put(dbList[0], dbList[1]);
		}
		if (dbMap.containsKey(id_pw[0])) {
			if (dbMap.get(id_pw[0]).equals(id_pw[1])) return "login";
			else return "wrong pw";
		}
		else return "fail";
	}

	public static void main(String[] args) {
		Login login = new Login();
		String[] idPw = {"meosseugi", "1234"};
		String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
		System.out.println(login.solution(idPw, db));   // "login"

		idPw = new String[]{"programmer01", "15789"};
		db = new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
		System.out.println(login.solution(idPw, db));   // "wrong pw"

		idPw = new String[]{"rabbit04", "98761"};
		db = new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};
		System.out.println(login.solution(idPw, db));   // "fail"

	}
}
