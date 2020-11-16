package Lesson3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Box <T extends  Fruit>  {
    public  String nameBox;
    ArrayList<T> arrBox;
  //  T boxType;

    public Box ( String  nameBox) {
        this.nameBox=nameBox;
        this.arrBox=new ArrayList<T>();
    }

//    public String getTypeBox() {
//        if (boxType instanceof Apple) {
//            return "apple";
//        } else return "orange";
//    }

    public void addFruit(T fruit) {
        arrBox.add(fruit);
    }
//    public float  getWeightBad() {
//        float res=0f;
//        for (int i = 0; i < arrBox.size()-1 ; i++) {
//            Fruit nextFr= (Fruit) arrBox.get(i);
//            res=res+nextFr.getWeight();
//        }
//        return res;
//    }

//    public float getWeight2 () {
//        if (boxType instanceof Apple) {
//            return 1.0f* arrBox.size();
//        } else return 1.5f*arrBox.size();
//    }
    public float getWeight () {
        if (arrBox.isEmpty())
            return 0;
        Fruit firstFruit = (Fruit) arrBox.get(0);
        return firstFruit.getWeight() * arrBox.size();
    }
   public boolean compare(Box<Orange> anotherBox) {
        return this.getWeight() == anotherBox.getWeight();
    }

    public  void shift(Box<? super T> anotherBox) {
        anotherBox.arrBox.addAll(this.arrBox);
        arrBox.clear();
    }

}
