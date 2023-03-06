import java.util.*;

public class ParkingCost {
    public int[] solution(int[] fees, String[] records) {
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> costs = new HashMap<>();

        for (String recode : records) {
            String[] part = recode.split(" ");
            int hour = Integer.parseInt(part[0].substring(0, 2));
            int minute = Integer.parseInt(part[0].substring(3, 5));
            int time = hour * 60 + minute;
            String key = part[1];
            if (part[2].equals("IN")) {
                map.put(key, time);
            } else {
                int newTime  = time - map.get(key);
                costs.put(part[1], costs.getOrDefault(key, 0) + newTime);
                map.remove(part[1]);
            }
        }

        if (!map.isEmpty()) {
            for (String key : map.keySet()) {
                int time = 23 * 60 + 59;
                int newTime  = time - map.get(key);
                costs.put(String.valueOf(key), costs.getOrDefault(key, 0) + newTime);
            }
        }

        List<String> keySet = new ArrayList<>(costs.keySet());
        Collections.sort(keySet);
        for (String key : keySet) {
            int time = costs.get(key);
            int cost = fees[1];
            if (time > fees[0]){
                cost += ((time - fees[0]) / fees[2]) * fees[3] + (((time - fees[0]) % fees[2]) == 0 ? 0 : fees[3]);
            }
            result.add(cost);
        }

        return result.stream().mapToInt(n -> n).toArray();
    }

    public static void main(String[] args) {
        ParkingCost parkingCost = new ParkingCost();
        System.out.println(Arrays.toString(parkingCost.solution(
                new int[]{180, 5000, 10, 600},
                new String[]{"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"}
        )));
    }
}
