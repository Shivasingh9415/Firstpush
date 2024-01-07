// Interfaces in english is a point where two systems meet and intercat.
// IN java interface is a group of related methods with empty bodies.

interface Bicycle1{
    int a = 45;
    void applybrake(int decrement);
    void speedup(int increment);
}

class Avon implements Bicycle1{
    void blowhorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applybrake(int decrement){
        System.out.println("Apply Brake");
    }
    public void speedup(int increment){
        System.out.println("Applying Speed up");
    }

}

public class interfaces_2nd_time_java {
    public static void main(String[] args) {
        Avon av = new Avon();
        av.applybrake(2);
//        you can create properties in interfaces but cannot modify them once they are made they are final.
        System.out.println(av.a);


    }
}
