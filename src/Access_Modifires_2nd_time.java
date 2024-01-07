class MYEmployee{
//    int number;
   private int id;
   private String name;

   public void setName(String n){
       name = n;
   }
   public void setid(int k){
       id = k;
   }
   public String getName(){
       return name;
   }
   public int getid(){
       return id;
   }

}

public class Access_Modifires_2nd_time {
    public static void main(String[] args){
        MYEmployee Shiva = new MYEmployee();
        Shiva.setName("king");
        System.out.println(Shiva.getName());
//        Shiva.number = 45;
//        System.out.println(Shiva.number);



    }
}
