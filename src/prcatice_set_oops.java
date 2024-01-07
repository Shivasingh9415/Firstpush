// ques 1 --->

//class Employees{
//    int salary;
//    String name;
//
//    public int getSalary(){
//        return salary;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String n){
//        name = n;
//    }
//}
//
//public class prcatice_set_oops {
//    public static void main (String[] args){
//        Employees Shiva = new Employees();
//        Shiva.setName("SHIVA");
//        System.out.println(Shiva.getName());
//
//    }
//}


// ques 2--->
// create a class cellphone with methods to print "ringing" , "vibrating"  etc



// ques 3 --> Create a class square with a method to initialize its side, calculating area, perimeter etc.


class square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

public class prcatice_set_oops {
    public static void main(String[] args) {
        square box = new square();
        box.side = 5;
        System.out.println(box.perimeter());
        System.out.println(box.area());


    }
}