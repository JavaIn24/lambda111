package Task2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stroke = new LinkedList<>();
        stroke.add("aaa");
        stroke.add("bb");
        stroke.add("ccccc");
        stroke.add("dddd");

        String max = Collections.max(stroke, (o1, o2) -> o1.length()-o2.length());
        System.out.println(max);
    }
}
