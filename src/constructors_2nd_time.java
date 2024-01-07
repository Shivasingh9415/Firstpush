//class MYemployee{
//    private int id;
//    private String name;
//
//    public void setName(String k){
//        name = k;
//    }
//    public void setId(int l){
//        id = l;
//    }
//    public String getName(){
//        return name;
//    }
//    public int getId(){
//        return id;
//    }
//
//    public MYemployee(){
//      id = 45;
//      name = "Shiva";
//    }
//}
//
//public class constructors_2nd_time {
//    public static void main(String[] args) {
//        MYemployee Shiva = new MYemployee();
//        System.out.println(Shiva.getId());
//
//
//    }
//}
class MYemployee{
    private int id;
    private String name;
    private double num;

    public void setNum(double d){
        num = d;
    }
    public double getNum(){
        return num;
    }

    public void setName(String k){
        name = k;
    }
    public void setId(int l){
        id = l;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    public MYemployee(){
        id = 45;
        name = "Shiva";
        num = 6.7;
    }
    public MYemployee(String myname){
        id = 45;
        name = myname;
    }
    public MYemployee(int myId, String myname, double number ){
        id = myId;
        name = myname;
        num = number;
    }
}

public class constructors_2nd_time {
    public static void main(String[] args) {
        MYemployee Shiva = new MYemployee();
        System.out.println(Shiva.getId());
        System.out.println(Shiva.getName());
        System.out.println(Shiva.getNum());


    }
}
