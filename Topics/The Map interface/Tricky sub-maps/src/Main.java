import java.util.*;
import java.util.stream.Collectors;

class MapUtils {
    public static Map<Integer, String> getSubMap(TreeMap<Integer, String> map) {
        if (map.firstKey() % 2 != 0) {
            return map.headMap(5, true)
                    .keySet()
                    .stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toMap(k -> k, map::get, (v1, v2) -> v1, LinkedHashMap::new));
        }
        return map.tailMap(map.lastKey() - 4, true)
                .keySet()
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toMap(k -> k, map::get, (v1, v2) -> v1, LinkedHashMap::new));
    }
}

/* Do not modify code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Integer, String> map = new TreeMap<>();
        Arrays.stream(scanner.nextLine().split("\\s")).forEach(s -> {
            String[] pair = s.split(":");
            map.put(Integer.parseInt(pair[0]), pair[1]);
        });

        Map<Integer, String> res = MapUtils.getSubMap(map);
        res.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}