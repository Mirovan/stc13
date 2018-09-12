package ru.innopolis.stc13.lesson2.homework;

public class Main {

    public static void main(String[] args) {
        System.out.println("Create an array");
        BubbleSort arr = new BubbleSort(20);
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

        // Создаем исключительную ситуацию, так просто для домашнего задания
        try{
            System.out.println("arr[n] = "+arr.at(0));
            System.out.println("arr[n] = "+arr.at(1));
            System.out.println("arr[n] = "+arr.at(2));
            System.out.println("arr[n] = "+arr.at(100));
        }catch (IndexOutOfBoundsSortingintArrayException e){
            System.out.println("IndexOutOfBoundsSortingintArrayException");
        }

    }

}
