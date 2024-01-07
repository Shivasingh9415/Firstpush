class Building{
    int stairs;
    String name;
    String place;
    public void enterprises(){
        System.out.println("number of stairs " + stairs);
        System.out.println("name of building is " + name);
        System.out.println("The place where building is located is " + place);

    }

}




public class chw_38_self {
    public static void main(String[] args) {
        Building Shiva = new Building();
        Shiva.stairs = 34;
        Shiva.name = "ShivaEnterprises";
        Shiva.place = "Mumbai";
      //  System.out.println(Shiva.place);
        Shiva.enterprises();

    }
}
