package az.eolymp;

//import java.util.*;
//
//public class Problem8997 {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int max = 0;
//        String a = sc.next();
//
//        List<Integer> list1 = new ArrayList<>();
//        List<Character> list2 = new ArrayList<>();
//        for (int i = 0; i < a.length(); i++) {
//            int sum = 0;
//            for (int j = 0; j < a.length(); j++) {
//                if (a.charAt(i) == a.charAt(j)) {
//                    sum++;
//                }
//            }
//            if (sum >= max) {
//                max = sum;
//                if (list1.isEmpty() || max == list1.get(list1.size() - 1)) {
//                    list1.add(max);
//                    list2.add(a.charAt(i));
//                } else if (max > list1.get(list1.size() - 1)) {
//                    list1.clear();
//                    list2.clear();
//                    list1.add(max);
//                    list2.add(a.charAt(i));
//                }
//            }
//        }
//
//        List<Character> list3 = new ArrayList<>();
//        for (int i = 0; i < list2.size(); i++) {
//            if (!list3.contains(list2.get(i))) {
//                list3.add(list2.get(i));
//            }
//        }
//        System.out.println(list1.get(0));
//        for (char elem : list3) {
//            System.out.print(elem + " ");
//        }
//    }
//}


import java.util.*;

public class Problem8997 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        Map<Character, Integer> charFrequency = new HashMap<>();
        int maxFrequency = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            charFrequency.put(currentChar, charFrequency.getOrDefault(currentChar, 0) + 1);
            maxFrequency = Math.max(maxFrequency, charFrequency.get(currentChar));
        }

        List<Character> mostFrequentChars = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                mostFrequentChars.add(entry.getKey());
            }
        }

        System.out.println(maxFrequency);
        for (char c : mostFrequentChars) {
            System.out.print(c + " ");
        }
    }
}
