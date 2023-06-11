package az.etibarSeyidzade.exam.arraySort;

import java.util.*;

public class hiylegerCesidleme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        List<Integer> result = new ArrayList<>();

        int previousLastDigit = numbers[0] % 10;
        result.add(numbers[0]);

        for (int i = 1; i < n; i++) {
            int lastDigit = numbers[i] % 10;

            if (lastDigit == previousLastDigit) {
                result.add(numbers[i]);
            } else {
                Collections.sort(result);
                printList(result);
                result.clear();
                result.add(numbers[i]);
            }

            previousLastDigit = lastDigit;
        }

        Collections.sort(result);
        printList(result);
    }

    private static void printList(List<Integer> list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
