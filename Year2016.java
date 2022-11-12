// 2016년

public class Year2016 {
    public String solution(int a, int b) {
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int date = 0;

        for (int i = 0; i < a - 1; i++)
            date += month[i];
        return days[(date + b) % days.length];
    }

    public static void main(String[] args) {
        Year2016 year2016 = new Year2016();
        System.out.println(year2016.solution(5, 24));
    }
}
