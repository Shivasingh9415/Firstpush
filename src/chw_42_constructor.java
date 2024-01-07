class mymainemployee {
    int salary;

    public void setsalary(int n){
       salary = n;
   }

    public int getsalary(){
        return salary;
    }

    public mymainemployee(int sub){
        sub = sub;
    }


}
public class chw_42_constructor {
    public static void main(String[] args) {
        mymainemployee shiva = new mymainemployee(10000);
        System.out.println(shiva.getsalary());

    }
}
