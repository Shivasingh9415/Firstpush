/* public class shiva_1 {
    public static void main(String[] args) {
        System.out.println("write a number");
        byte a = 45;
        byte b = 56;
        byte c = 86;
        int d = a+b+c;
        System.out.println(d);
          }
}*/
abstract class Area{
    abstract void area();
}
class Square extends Area {
    void area(){
        int s = 8;
        System.out.println("Area of square: " + s*s);
    }
}
class Circle extends Area {
    void area(){
        int r = 10;
        System.out.println("Area of circle: "+ 3.14*r*r);
    }
    public static void main(String[] args){
        Area ob1 = new Square();
        Area ob2 = new Circle();
        ob1.area();
        ob2.area();
    }
}
