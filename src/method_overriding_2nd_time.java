class A1{
    int a;
    public int Shiva(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B1 extends A{

    public void meth2(){
        System.out.println("I am a method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am a method 3 of clas B");
    }
}


public class method_overriding_2nd_time {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.meth2();
        B1 b1 = new B1();
        b1.meth2();


    }
}
