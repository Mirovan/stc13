package ru.innopolis.stc13.lessens3.lecture;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(4);
        arrayList.add(5);

        Integer i = arrayList.get(1);

        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Mark");
        hashMap.put(2,"Jane");

        System.out.println(hashMap);
    }
}
