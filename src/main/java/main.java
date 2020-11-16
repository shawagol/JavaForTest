import Lesson3.Apple;
import Lesson3.Fruit;
import Lesson3.Orange;
import  Lesson3.Box;
import java.util.Arrays;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        Apple apple1 = new Apple("apple1");
        Apple apple2 = new Apple("apple2");
        Apple apple3 = new Apple("apple3");

        Orange orange1 = new Orange("orange1");
        Orange orange2 = new Orange("orange2");
        Orange orange3 = new Orange("orange3");

        Box <Apple> boxApple = new Box("appleBox1");
        boxApple.addFruit(apple1);
        boxApple.addFruit(apple2);
        boxApple.addFruit(apple3);
        boxApple.getWeight();
        System.out.println("Коробка "+ boxApple.nameBox + " весит: " + boxApple.getWeight());

        Box <Orange> boxOrange = new Box("orangeBox1");
        boxOrange.addFruit(orange1);
        boxOrange.addFruit(orange2);
        boxOrange.addFruit(orange3);
        boxOrange.getWeight();
        System.out.println("Коробка "+ boxApple.nameBox + " весит: " + boxOrange.getWeight());

        System.out.println("Сравить вес коробок: "+boxApple.compare(boxOrange));
        if(boxApple.compare(boxOrange)) {
            System.out.println("Коробки равны по весу");
        } else System.out.println("Коробки не равны по весу");


        Box <Apple> boxApple2 = new Box("appleBox2");
        boxApple.shift(boxApple2);





        Integer[] arr = {1,2,3,4,5,6,7};

        swapElements(arr, 1, 6);
        System.out.println(Arrays.toString(arr));
    }
    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


}
