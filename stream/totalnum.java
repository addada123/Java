package stream;

import java.util.Arrays;

public class totalnum {
    public static void main(String[] args) {
        System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive("cccccccccccccc", "b", "c", "d"));

    }

    // Array elemanlarını al => stream()
    // 5'ten uuzn isimler al => filter()
    // geri kalan listedeki tüm harfleri sayısını getir => mapToInt()
    // Harf sayılarını topla => sum()
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names).filter(name -> name.length() > 5).mapToInt(name -> name.length()).sum();
    }
}
