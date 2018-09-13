package ru.innopolis.stc13.lessens3.lecture.extends1;

import java.util.HashMap;
import java.util.Map;

public class MyStore<K,V> {
    HashMap<K,V> store = new HashMap<>();

    void putAll(Map<K, ? extends V> entries){
        store.putAll(entries);
    }

}
