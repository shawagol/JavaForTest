import java.io.File;
import java.io.FileWriter;

public class main {


    public static void main(String[] args) {


        try {
            File file = new File("./file.csv");
            FileWriter writeFile = new FileWriter(file, false);
            String header="Field1; Field2; Field3";
            writeFile.write(header);
            writeFile.append('\n');
            Integer number = 100;
            writeFile.write(number.toString());
            writeFile.write("; ");
            number = 200;
            writeFile.write(number.toString());
            writeFile.write("; ");
            number = 300;
            writeFile.write(number.toString());
            writeFile.write("; ");
            writeFile.append('\n');
            number = 250;
            writeFile.write(number.toString());
            writeFile.write("; ");
            number = 300;
            writeFile.write(number.toString());
            writeFile.write("; ");
            number = 400;
            writeFile.write(number.toString());
            writeFile.write("; ");
            writeFile.append('\n');

            writeFile.flush();
            writeFile.close();

        } catch (Exception e) {
            // если любая ошибка ввода/вывода
            e.printStackTrace();
        }

    }
}
