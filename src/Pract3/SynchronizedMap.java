package Pract3;

import java.util.HashMap;
import java.util.Map;

class SynchronizedMap<K, V> {
    private final Map<K, V> map = new HashMap<>();

    public synchronized void put(K key, V value) {
        map.put(key, value);
    }

    public synchronized V get(K key) {
        return map.get(key);
    }

    public synchronized boolean containsKey(K key) {
        return map.containsKey(key);
    }

    public synchronized void remove(K key) {
        map.remove(key);
    }

    public synchronized int size() {
        return map.size();
    }
}
