package lesson7;

import java.io.IOException;
import java.util.Scanner;

public class UserInterface {
    private  final  Controller controller =new Controller();

    public  void  runApplication() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("введите названия города на английском языке");
            String city = scanner.nextLine();

            setGlobalCity(city);

            System.out.println("Ввведите ответ: ");
            System.out.println("1 - получите текущую погоду. ");
            System.out.println("2 - получите погоду на следующие 5 дней.");
            System.out.println("выход (exit) - завершите работу.");
            String result = scanner.nextLine();

            checkIsExit(result);


            try {
                validateUserInput(result);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }

            try {
                notifyController(result);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
        }
    }
        private void checkIsExit (String result) {
            if (result.toLowerCase().equals("выход") || result.toLowerCase().equals("exit")) {
                System.out.println("Завершина работа");
                System.exit(0);
            }
        }
        private void setGlobalCity(String city){
            ApplicationGlobalState.getInstance().setSelectedCity(city);
        }
        private  void  validateUserInput(String userInput) throws  IOException {
        if (userInput ==null || userInput.length() !=1) {
            throw  new IOException("rwetsgsdfs" + userInput);
            }
        int answer = 0;
        try {
            answer=Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            throw new IOException("fsgsdgsdgs!!!!!");
        }
    }

    private  void  notifyController(String input) throws  IOException {
        controller.onUserInput(input);
    }


}
