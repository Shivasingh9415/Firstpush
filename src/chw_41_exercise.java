class MymainEmployee{
    private int ID;
    String name;

    public MymainEmployee(String myName , int MyId){
        ID = MyId;
        name = myName;
    }

    public void setName(String s){
        name = s;
    }

    public String getName(){
        return name;
    }
}


public class chw_41_exercise{
    public static void main(String[] args) {

        MymainEmployee shiva = new MymainEmployee("shiva" , 12);



    }
}
