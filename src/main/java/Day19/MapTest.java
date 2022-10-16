package Day19;

/*
 ** @author LiGuanda
 ** @date  PM 4:02:47
 ** @description This is a description of MapTest
 ** @params
 ** @return
 ** @since version-1.0  */


import java.util.*;

/**
 * @author Lenovo
 */
public class MapTest {


    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("wife", "IU");
        String put = map.put("wife", "JuJingyi");
        String put1 = map.put("husband", "Dage");
        System.out.println(put);
        System.out.println(put1);
        System.out.println(map.getOrDefault("Wife2", "IU"));
        Map<String, String> map1 = new HashMap<>();
        map1.put("wife2", "IU");
        map.putAll(map1);
        map.forEach((k, v) -> System.out.println("k = " + k + " v = " + v));
        TreeMap<String, String> map2 = new TreeMap<>();

        map2.put("wife", "JUJingyi");
        map2.put("wife2", "IU");
        map2.put("husband", "Dage");
        System.out.println(map2.firstKey());
        System.out.println(map2.lastKey());
        map2.merge("aaa", "22", String::concat);
        Set<String> keySet = map.keySet();
        System.out.println("------------------------");
        keySet.forEach(System.out::println);
        Collection<String> values = map.values();
        values.forEach(System.out::println);
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println("-----------------------");
        entries.forEach(System.out::println);
        Map<String, Integer> map3 = new LinkedHashMap<>();
        map3.put("aaa", 111);
        map3.put("bbb", 222);
        map3.put("ccc", 333);
        map3.forEach((k, v) -> System.out.println("k = " + k + " v = " + v));
        EnumSet<Weekday> enumSet = EnumSet.allOf(Weekday.class);
        System.out.println("----------------");
        enumSet = EnumSet.range(Weekday.Thr, Weekday.Sun);
        enumSet.forEach(System.out::println);
        map3 = Map.ofEntries(Map.entry("ddd", 444), Map.entry("eee", 555));
        List<String> strings = Collections.nCopies(100, "666");
        List<String> strings1 = Arrays.asList("aaa", "bbb");
        ArrayList<String> arrayList = new ArrayList<>(List.of("aaa", "bbb"));
        Map<Object, Object> objectObjectMap = Collections.emptyMap();
        Set<String> aaa = Collections.singleton("aaa");
        Map.Entry<String, Integer> entry = Map.entry("aaaa", 1111);
        SortedMap<String, String> sortedMap = map2.subMap("aaa", "bbb");
        sortedMap.forEach((k, v) -> System.out.println("k = " + k + " v = " + v));
        Map<String, String> map4 = Collections.unmodifiableMap(map2);
        map4.forEach((k, v) -> System.out.println("k = " + k + " v = " + v));
        //Map<String, String> map5 = Collections.synchronizedMap(map4);
        Map<String, String> map5 = Collections.checkedMap(map4, String.class, String.class);
        ArrayDeque<String> deque = new ArrayDeque<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();


    }


}


enum Weekday {

    Mon, Tue, Wed, Thr, Fri, Sat, Sun;

}
