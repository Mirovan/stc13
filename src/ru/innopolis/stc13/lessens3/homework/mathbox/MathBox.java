package ru.innopolis.stc13.lessens3.homework.mathbox;

import java.util.*;

public class MathBox{
    private TreeSet<Integer> sortedArray;

    public MathBox(Integer[] array) throws MathBoxDuplicateElementException {
        sortedArray = new TreeSet<>();
        for(Integer element: array){
            if(sortedArray.contains(element)){
                throw new MathBoxDuplicateElementException(element.toString());
            }else{
                sortedArray.add(element);
            }
        }
    }

    public Integer summator(){
        Integer summ = 0;
        for(Integer element: sortedArray){
            summ += element;
        }
        return summ;
    }

    public ArrayList<Integer> splitter (Integer divider) throws ArithmeticException{
        ArrayList<Integer> outList = new ArrayList<>();
        try{
            for(Integer element: sortedArray){
                outList.add(element/divider);
            }
        }catch (ArithmeticException e){
            throw e;
        }
        return outList;
    }

    public boolean remove(Integer value){
        return sortedArray.remove(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return Objects.equals(sortedArray, mathBox.sortedArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sortedArray);
    }

    @Override
    public String toString() {
        return "MathBox{" + sortedArray +'}';
    }

}
