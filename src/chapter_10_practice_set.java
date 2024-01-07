class Circle1{
    public int radius;

    Circle1(int r){
        System.out.println("I am a circle parameterized constructor");
        radius = r;

    }

    public double area(){
        return 22/7*radius*radius;
    }

}

class cylinder1 extends Circle1{
    int height;
    cylinder1(int r, int h){
        super(r);
        System.out.println("I am a cylinder parameterized constructor");
        height =h;

    }
    public double volume(){
        return 22/7*radius*radius*radius;
    }
}


public class chapter_10_practice_set {
    public static void main(String[] args) {
        cylinder1 ne = new cylinder1(23,45);
        ne.volume();
        System.out.println(ne.volume());
        System.out.println(ne.area());

    }
}
