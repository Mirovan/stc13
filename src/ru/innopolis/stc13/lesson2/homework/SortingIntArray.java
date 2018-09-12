package ru.innopolis.stc13.lesson2.homework;

public class SortingIntArray {
    protected final int maxCount;
    protected int count = 0;
    protected int intArray[];

    public SortingIntArray(int maxCount){
        this.maxCount = maxCount;
        intArray = new int[maxCount];
    }

    public final boolean add(int value){
        if(count<maxCount){
            intArray[count]=value;
            count++;
            return true;
        }
        return false;
    }

    public final void printArray(){
        if(count == 0){
            System.out.println("The array is empty.");
            return;
        }
        System.out.print("Array["+intArray[0]);
        for(int i = 1; i<count; i++){
            System.out.print(", "+intArray[i]);
        }
        System.out.println("];");
    }

    protected final void toSwap(int first, int second){
        int dummy = intArray[first];
        intArray[first] = intArray[second];
        intArray[second] = dummy;
    }

    protected final int at(int index) throws IndexOutOfBoundsSortingintArrayException{
        if(index<0 || index>=count){
            throw new IndexOutOfBoundsSortingintArrayException();
        }
        return intArray[index];
    }

    public void sort(){
        //no sorted
    }
}
