package ru.innopolis.stc13.lessens3.homework.mathbox;

public class Main {
    public static void main(String[] args) {

        //добавим массив
        try {
            Integer[] arr = {15,2,57,1,5,3};
            MathBox mathBox = new MathBox(arr);
            System.out.println(mathBox);
            System.out.println("Summator: " + mathBox.summator());
            System.out.println("Splitter(2): " + mathBox.splitter(2));
            System.out.println("Remove(5): " + mathBox.remove(5));
            System.out.println(mathBox);

        }catch(MathBoxDuplicateElementException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
        //допустим ошибку при добавлении массива чтоб вызвать исключение
        try {
            Integer[] arr = {15,2,57,1,1,5,2};
            MathBox mathBox = new MathBox(arr);
            System.out.println(mathBox);
        }catch(MathBoxDuplicateElementException e){
            e.printStackTrace();
        }


        System.out.println("End");

    }
}
