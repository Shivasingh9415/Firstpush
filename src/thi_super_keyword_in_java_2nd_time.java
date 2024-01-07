class Ekclass{
    int a;
    public int return1(){
        return 1;
    }

    public int getA(){
        return a;
    }
    Ekclass(int v){
        a =v;
    }
}


public class thi_super_keyword_in_java_2nd_time {
    public static void main(String[] args) {
        Ekclass e1 = new Ekclass(56);
        System.out.println(e1.getA());



    }
}
