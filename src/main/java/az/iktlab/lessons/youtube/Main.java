package az.iktlab.lessons.youtube;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Family> list = new ArrayList<>();
        list.add(new Family("Zakir", 16));
        list.add(new Family("Gulchohra", 18));

        // First way
        // list.stream().forEach(user -> user.run());
        list.forEach(Family::run);

        // Filter and collect method
        List<Family> filteredlist = list.stream()
                .filter(user -> user.getAge() > 17)
                .collect(Collectors.toList());

        filteredlist.stream()
                .forEach(Family::isAge);

        long a = list.stream()
                .filter(user -> user.getAge() > 15)
                .count();

        System.out.println(a);

        // Map function
        List<Family> mappedList = list.stream()
                .map(user -> new Family(user.getName(), user.getAge() + 100))
                .collect(Collectors.toList());

        mappedList.forEach(System.out::println);

        Map<String, Integer> map1 = list.stream().collect(Collectors.toMap(Family::getName, Family::getAge));

        map1.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
