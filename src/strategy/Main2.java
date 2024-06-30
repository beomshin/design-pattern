package strategy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(list);

        list.sort(((o1, o2) -> o2.compareTo(o1)));

        System.out.println(list);
    }
}
