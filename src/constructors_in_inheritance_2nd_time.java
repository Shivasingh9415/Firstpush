class Base1{
    Base1(){
        System.out.println("I am a constructor of base1 class");
    }
    Base1(int a){
        System.out.println("I am overloaded constructor of Base1 class");
    }
}
class derived extends Base1{
    derived(){
        super(34);
        System.out.println("I am a constructor of derived class ");
    }
    
}
public class constructors_in_inheritance_2nd_time {
    public static void main(String[] args) {
        derived de = new derived();


    }
}
