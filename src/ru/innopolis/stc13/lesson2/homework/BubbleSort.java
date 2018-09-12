package ru.innopolis.stc13.lesson2.homework;

public class BubbleSort extends SortingIntArray {

    public BubbleSort(int maxCount){
        super(maxCount);
    }

    public void sort(){
        if(count<2){
            return;
        }
        boolean repeat = true;
        while (repeat){
            repeat = false;
            for(int i = 1; i<count;i++){
                if(intArray[i-1]>intArray[i]){
                    toSwap(i-1,i);
                    repeat = true;
                }
            }
        }

    }
}
