import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int size = scanner.nextInt();
        Map<Integer, String> pairs = new TreeMap<>();
        for (int i = 0; i < size; i++) {
            int key = scanner.nextInt();
            String value = scanner.next();
            pairs.put(key, value);
        }
        pairs.entrySet()
                .stream()
                .dropWhile(s -> s.getKey() < start)
                .takeWhile(s -> s.getKey() <= end)
                .forEach(s -> System.out.println(s.getKey() + " " + s.getValue()));
    }
}