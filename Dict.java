// 프로그래머스 - 모음사전

import java.util.*;

//public class Dict {
//    List<String> list = new ArrayList<>();
//
//    public int solution(String word) {
//        int answer = 0;
//
//        dfs("");
//        answer = list.indexOf(word);
//        return answer;
//    }
//
//    private void dfs(String word) {
//        if (word.length() > 5) return;
//
//        list.add(word);
//
//        for (int i = 0; i < 5; i++) {
//            dfs(word + "AEIOU".charAt(i));
//        }
//    }
//    public static void main(String[] args) {
//        Dict dict = new Dict();
//        System.out.println(dict.solution("AAAAE"));
//    }
//}

public class Dict {
    Map<String, Integer> map = new HashMap<>();
    int count = 0;

    public int solution(String word) {
        dfs("");
        return map.get(word);
    }

    private void dfs(String word) {
        if (word.length() > 5) return;

        map.put(word, count++);

        for (int i = 0; i < 5; i++) {
            dfs(word + "AEIOU".charAt(i));
        }
    }
    public static void main(String[] args) {
        Dict dict = new Dict();
        System.out.println(dict.solution("AAAAE"));
    }
}