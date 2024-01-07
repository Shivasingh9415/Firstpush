import org.w3c.dom.ls.LSOutput;

interface BasicAnimal{
    void eat();
    void sleep();

    default void run(){
        System.out.println("Monkey runs");
    }
}

class Monkey{
    public void jump(){
        System.out.println("Monkey is jumping");
    }
    public void bite(){
        System.out.println("Monkey is bitting");
    }
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("monkey eats");
    }
    public void sleep(){
        System.out.println("monkey sleeps");
    }
}


public class practice_questions_on_abstract_and_interfaces {
    public static void main(String[] args) {
        Human insaan = new Human();
        Monkey bandar = new Human();
        bandar.bite();
//        insaan.eat();
//        insaan.run();

    }
}
