package Lesson1;

public class Treadmill{
    protected  String name;
    protected double runLength;


    public  Treadmill (String name, double runLength) {
        this.name=name;
        this.runLength = runLength;
    }

    public void run(Cat cat) {
        if (cat.runLength >= runLength) {
            System.out.println( cat.name + "- пробежал по беговой дорожке " + name );
        } else {
            System.out.println(  cat.name + " - не смог пробежать по беговой дорожке " + name);
        }
    }
    public void run(Human human) {
        if (human.runLength >= runLength) {
            System.out.println( human.name + "- пробежал по беговой дорожке " + name );
        } else {
            System.out.println(  human.name + " - не смог пробежать по беговой дорожке " + name);
        }
    }
    public void run(Robot robot) {
        if (robot.runLength >= runLength) {
            System.out.println( robot.name + "- пробежал по беговой дорожке " + name );
        } else {
            System.out.println(  robot.name + " - не смог пробежать по беговой дорожке " + name);
        }
    }


}
