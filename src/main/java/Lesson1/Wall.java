package Lesson1;

public class Wall {
    protected  String name;
    protected double heightWall; // 1 стена, 0 - нет стены

    //private int jump;

    public  Wall (String name, double heightWall) {
        this.name=name;
        this.heightWall = heightWall;
    }
    public void jump(Cat cat) {
        if (cat.heightJump >= heightWall) {
            System.out.println( cat.name + "- препрыгнул стену " + name );
        } else {
            System.out.println(  cat.name + " - не смог перепрыгнуть стену " + name);
        }
    }
    public void jump(Human human) {
        if (human.heightJump >= heightWall) {
            System.out.println( human.name + "- препрыгнул стену " + name );
        } else {
            System.out.println(  human.name + " - не смог перепрыгнуть стену " + name);
        }
    }
    public void jump(Robot robot) {
        if (robot.heightJump >= heightWall) {
            System.out.println( robot.name + "- препрыгнул стену " + name );
        } else {
            System.out.println(  robot.name + " - не смог перепрыгнуть стену " + name);
        }
    }



}
