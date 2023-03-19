// 프로그래머스 - 스킬트리

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        Queue<String> queue;
        int result = 0;

        for (String skill_tree : skill_trees) {
            boolean flag = true;
            queue = new LinkedList<>(Arrays.asList(skill.split("")));
            for (String ch : skill_tree.split("")) {
                if (queue.contains(ch)) {
                    if (queue.peek().equals(ch)) {
                        queue.poll();
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
            result += flag ? 1 : 0;
        }
        return result;
    }

    public static void main(String[] args) {
        SkillTree skillTree = new SkillTree();
        System.out.println(skillTree.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }
}
