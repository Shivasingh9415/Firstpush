// meaning of abstract --> Abstract means existing in thoughts and ideas without concrete existance.
// A method that is declared without implementation.

abstract class Base3{
    Base3(){
        System.out.println("Main base3 k constructor hoon");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class derived3 extends Base3{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }

}
public class abstract_classes_and_interfaces_2nd_time {
    public static void main(String[] args) {
        Base3 bt = new derived3();
//        Base3 be = new Base3();---> cannot be made because Base3 is a abstract class.
//        bt.sayhello();

    }
}
