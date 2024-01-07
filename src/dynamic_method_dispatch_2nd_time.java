class One{
    public void name(){
        System.out.println("My name is class one");
    }
    public void on(){
        System.out.println("I am on of class One");
    }
//    public One(){
//        System.out.println("I am constructor of first class");
//    }
}

class Two extends One{
    public void name2(){
        System.out.println("My name is class two");
    }
    @Override
    public void on(){
        System.out.println("I am on of class Two");

    }
//    public Two(){
//        System.out.println("I am constructor of second class");
//    }
}


public class dynamic_method_dispatch_2nd_time {
    public static void main(String[] args) {
        One one = new Two();
//        one.name();
        one.on();
//        one.name2(); --> not allowed
//         One obj = new Two();


    }
}
