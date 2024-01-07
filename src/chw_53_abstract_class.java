abstract class parent{
    public parent(){
        System.out.println("Main base class ka constructor hun");
    }
    public void SayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class child extends parent{
    public void greet(){
        System.out.println("good morning");
    }
}




public class chw_53_abstract_class {
    public static void main(String[] args) {
        child c = new child();
        parent p = new child();


    }
}
