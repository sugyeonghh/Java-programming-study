// 프로그래머스 - 오픈채팅방

import java.util.*;

public class OpenChatting {
    public String[] solution(String[] record) {
        List<String> answer = new ArrayList<>();

        Map<String, String> names = new HashMap<>();
        for (String r : record) {
            String[] word = r.split(" ");
            if (word.length == 3) names.put(word[1], word[2]);
        }

        for (String r : record) {
            String[] word = r.split(" ");
            if (word[0].equals("Enter")) {
                answer.add(names.get(word[1]) + "님이 들어왔습니다.");
            } else if (word[0].equals("Leave")) {
                answer.add(names.get(word[1]) + "님이 나갔습니다.");
            }
        }

        return answer.toArray(new String[0]);
    }

    public static void main(String[] args) {
        OpenChatting openChatting = new OpenChatting();
        System.out.println(Arrays.toString(openChatting.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"})));
    }
}
