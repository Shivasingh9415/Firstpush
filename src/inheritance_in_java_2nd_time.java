class Base{
    int x;
    public void setx(int x){
        System.out.println("I am in base class");
        x = x;
    }
    public int getX(){
        return x;
    }
    public void printMe(){
        System.out.println("I am ");
    }

}

class Derived extends Base{
    int y;

    public void setY(int y){
        y = y;
    }
    public int getY(){
        return y;
    }
}

public class inheritance_in_java_2nd_time {
    public static void main(String[] args) {
        Derived xy = new Derived();
//        xy.setx(4);
//        xy.setY(6);
//        System.out.println(xy.getX());
//        System.out.println(xy.getY());

    }
}
