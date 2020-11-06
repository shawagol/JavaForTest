package Lesson1;

public class Treadmill{
    protected  String name;
    protected double runLength;


    public  Treadmill (String name, double runLength) {
        this.name=name;
        this.runLength = runLength;
    }

    public boolean run(Cat cat) {
        if (cat.runLength >= runLength) {
            System.out.println( cat.name + "- пробежал по беговой дорожке " + name );
            return true;
        } else {
            System.out.println(  cat.name + " - не смог пробежать по беговой дорожке " + name);
            return false;
        }
    }
    public boolean run(Human human) {
        if (human.runLength >= runLength) {
            System.out.println( human.name + "- пробежал по беговой дорожке " + name );
            return true;
        } else {
            System.out.println(  human.name + " - не смог пробежать по беговой дорожке " + name);
            return false;
        }
    }
    public boolean run(Robot robot) {
        if (robot.runLength >= runLength) {
            System.out.println( robot.name + "- пробежал по беговой дорожке " + name );
            return true;
        } else {
            System.out.println(  robot.name + " - не смог пробежать по беговой дорожке " + name);
            return false;
        }
    }


}
