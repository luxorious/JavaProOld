package lessons.lesson7.src.stream;

import java.util.Arrays;
import java.util.List;

public class MREx {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("!!!", "@@@", "£££");

        stringList.forEach(System.out::println);
    }
}
