// 컨트롤 제트

import java.util.ArrayList;
import java.util.Arrays;

public class ControlZ {
    public int solution(String s) {
        ArrayList<String> items = new ArrayList<>(Arrays.asList(s.split(" ")));
        String z = "Z";
        int sum = 0;

        while (items.contains(z)) {
            items.remove(items.indexOf(z) - 1);
            items.remove(items.indexOf(z));
        }
        for (String item : items)
            sum += Integer.parseInt(item);
        return sum;
    }

    public static void main(String[] args) {
        ControlZ controlZ = new ControlZ();
        System.out.println(controlZ.solution("1 2 Z 3"));       // 4
        System.out.println(controlZ.solution("10 20 30 40"));   // 100
        System.out.println(controlZ.solution("10 Z 20 Z 1"));   // 1
    }
}
