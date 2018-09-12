package ru.innopolis.stc13.lesson2.homework;

public class Main {

    public static void main(String[] args) {
        System.out.println("Create an array");
        BubbleSort arr = new BubbleSort(100);
        while (true){
            int value = (int)(100.0d * Math.random());
            if(arr.add(value)!=true){
                break;
            }
        }
        arr.printArray();
        System.out.println("Sorting BubbleSort...");
        arr.sort();
        arr.printArray();

    }

}
