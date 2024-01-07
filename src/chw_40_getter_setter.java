class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setid(int i){
        id = i;
    }

    public int getid(){
        return id;
    }

}

public class chw_40_getter_setter {


    public static void main(String[] args) {

        MyEmployee shiva = new MyEmployee();
        shiva.setName("SHIVA");
        System.out.println(shiva.getName());
        shiva.setid(45);
        System.out.println(shiva.getid());


    }
}
