// Interface in english is a point where two systems meet.
// In JAVA interface is a group of related methods with empty bodies.

interface Bicycle{
    int a = 987;
    void applybrake();
    void speedup();

}

interface Blowhorn{
    void Blowhornkgf();
    void Blowhornkgf2();
}

class AvonCycle implements Bicycle,Blowhorn{
    public void applybrake(){
        System.out.println("Applying Brake");
    }

    public void speedup(){
        System.out.println("Speeding Up");
    }

    public void Blowhornkgf(){
        System.out.println("po po po po");
    }

    public void Blowhornkgf2(){
        System.out.println("pe pe pe pe");
    }

}

public class chw_54_interfaces {
    public static void main(String[] args) {
        AvonCycle shiva = new AvonCycle();
        shiva.speedup();
        shiva.Blowhornkgf();
        System.out.println(shiva.a);


    }
}
