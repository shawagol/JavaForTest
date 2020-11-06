package Lesson1;

//Создайте два класса: беговая дорожка и стена,
// при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать),
// результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).


import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik", 2, 30);
        Human human1 = new Human("Robert", 1.8,100 );
        Robot robot1 = new Robot("R2D2", 0, 1000);

        Object[] members = {
            cat1,human1,robot1
        };

        Treadmill treadmill1 = new Treadmill("№1", 1000);

//        treadmill1.run(cat1);
//        treadmill1.run(human1);
//        treadmill1.run(robot1);

        Wall wall1 = new Wall("Кирпич", 1.8);
//        wall1.jump(cat1);
//        wall1.jump(human1);
//        wall1.jump(robot1);

        Object[] obstacles = {
                 wall1,treadmill1
        };

        for (int i = 0; i < members.length; i++) {

            for (int j = 0; j <obstacles.length ; j++) {
                if (obstacles[j] instanceof Wall) {

                    if (members[i] instanceof Cat) {
                       if (! ((Wall) obstacles[j]).jump((Cat) members[i]))
                           break;
                    }
                    if (members[i] instanceof Human) {
                       if (! ((Wall) obstacles[j]).jump((Human) members[i]))
                           break;
                    }
                    if (members[i] instanceof Robot) {
                        if (!((Wall) obstacles[j]).jump((Robot) members[i]))
                            break;
                    }
                } else {

                    if (members[i] instanceof Cat) {
                        if (!((Treadmill) obstacles[j]).run((Cat) members[i]))
                            break;
                    }
                    if (members[i] instanceof Human) {
                        if (!((Treadmill) obstacles[j]).run((Human) members[i]))
                            break;
                    }
                    if (members[i] instanceof Robot) {
                        if (!((Treadmill) obstacles[j]).run((Robot) members[i]))
                            break;
                    }
                }
        }
    }

    }
}
