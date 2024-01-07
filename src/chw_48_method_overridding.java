
class A {
    public int A;

    public int harry() {
        return 4;

    }

    public void meth2() {
        System.out.println("I am 2 of class A");
    }
}
    class B extends A{
        //public void meth2(){
        //    System.out.println("I am 2 of class B");
      //  }

        public void meth3(){
            System.out.println("I am 3 of class B");
        }
    }
    



public class chw_48_method_overridding {
    public static void main(String[] args) {
        A shiva = new A();
        shiva.meth2();

        B shiv = new B();
        shiv.meth2();


    }
}
