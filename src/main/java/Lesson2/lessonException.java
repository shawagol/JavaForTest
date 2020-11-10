package Lesson2;

public class lessonException {


    public static void main(String[] args) {
        // описал пременную arrayString типа String и инициализировал вызов типа данных String
        // с присвоенными значения размера массива 4 на 4
        String[][] arrayString = new String[][]{
                {"1", "1", "3", "6"},
                {"2", "4", "2", "2"},
                {"1", "2", "2", "2"},
                {"а", "2", "2", "2"}
        };


        try {
            int result = 0;
            result = arrInt(arrayString);
            System.out.println(result);
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } catch (MyArraySizeException s) {
            System.out.println(s.getMessage());
        }

    }


        public static int arrInt(String[][] arrayString) throws MyArraySizeException {

        if (arrayString.length != 4)
                throw new MyArraySizeException("Массив может быть размером 4х4, иначе никак.");

            int sum=0;
            for (int i = 0; i < arrayString.length; i++) {
                for (int j = 0; j < arrayString.length; j++) {
                    try {
                        sum = sum + Integer.parseInt(arrayString[i][j]);
                    }
                    catch (NumberFormatException e) {
                        throw new MyArrayDataException("Ошибка в массиве. Строка: " +(i+1) +", колонка: "+(j+1));
                    }
                }
            }
            return sum;

}


            static class MyArraySizeException extends Exception {
                MyArraySizeException(String s) {
                    super(s);
                }
            }
            static class MyArrayDataException extends NumberFormatException {
                MyArrayDataException(String e) {
                    super(e);
                }
            }
}
