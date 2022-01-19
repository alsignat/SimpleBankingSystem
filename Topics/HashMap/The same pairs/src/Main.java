import java.util.*;


class MapFunctions {

    public static void calcTheSamePairs(Map<String, String> map1, Map<String, String> map2) {
        map1.entrySet().retainAll(map2.entrySet());
        System.out.println(map1.size());
    }
}