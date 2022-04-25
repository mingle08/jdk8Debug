package demo.jdk8study;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        // 因为map默认初始大小是16，所以0和32落在同一个桶，1和17落在同一个桶
        map.put(0, "ZERO");
        map.put(32, "32");
        map.put(1, "ONE");
        map.put(17, "17");

        // 16 * 0.75 = 12
        for (int i = 3; i < 10; i++) {
            map.put(i, "Str_" + i);
        }

        printMap(map);
        // 现在有11个数了，再加一个就达到扩容的阈值12
        map.put(2, "First");
        map.put(18, "First");

        printMap(map);

    }

    private static void printMap(Map<Integer, String> map) {
        System.out.println("现在Map中的元素个数：" + map.size());
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}
