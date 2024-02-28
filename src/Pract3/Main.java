package Pract3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer>  map = new HashMap<String, Integer>();

        map.put("first", 1);
        map.put("second", 2);
        map.put("third", 3);

        Map<String, Integer>  synmap = Collections.synchronizedMap(map);

        System.out.println(synmap);
    }
}
