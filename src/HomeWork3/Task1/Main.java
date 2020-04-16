package HomeWork3.Task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] words = new String[]{"хлеб", "вода", "помидор", "девка", "платье", "коза", "нос", "рот", "ёж", "ёрш", "анекдот", "глаз", "судно", "весна",
                "коза", "рот", "ёж", "вода", "девка", "платье", "нос", "платье", "ёрш", "хлеб", "вода"};

        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        Collections.addAll(set, words);
        Collections.addAll(list, words);

        int n = 0;

        for (Object o : set) {
            for (Object o1 : list) {
                if (o == o1) n += 1;
            }
            System.out.printf("Слово %s повторяется %d раз(а) \n", o, n);
            n = 0;
        }
    }

}