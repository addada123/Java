import java.util.Arrays;
import java.util.stream.Collectors;

public class WeightSort {

    public static String orderWeight(String str) {
        return Arrays.stream(str.split(" ")).sorted((String num1, String num2) -> {
            int w1 = Arrays.stream(num1.split("")).mapToInt(x -> Integer.parseInt(x)).sum();
            int w2 = Arrays.stream(num2.split("")).mapToInt(x -> Integer.parseInt(x)).sum();
            if (w1 < w2) {
                return -1;
            } else if (w1 == w2) {
                return num1.compareTo(num2);
            } else {
                return 1;
            }
        }).collect(Collectors.joining(" "));
    }

}