// 프로그래머스 - 전화번호 목록

import java.util.Arrays;

public class PhoneBook {
	public boolean solution(String[] phone_book) {
		Arrays.sort(phone_book);
		for (int i = 0; i < phone_book.length - 1; i++) {
			String s = phone_book[i];
			if (phone_book[i + 1].startsWith(s)) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		PhoneBook phoneBook = new PhoneBook();
		System.out.println(phoneBook.solution(new String[]{"119", "97674223", "1195524421"}));
		System.out.println(phoneBook.solution(new String[]{"777", "123","456","789"}));
	}
}
