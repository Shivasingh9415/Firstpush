interface Mywifi{
    String[] getNetworks();
    void connectToNetworks(String networks);
}
interface MyCamera {
    void takesnap();

    void recordvideo();
}
 class Mycellphone{
    void callNumber(int phonenumber){
        System.out.println("calling"+ phonenumber);
    }
    void pickcall(){
        System.out.println("connecting.....");
    }



 }

 class MySmartphone extends Mycellphone implements MyCamera,Mywifi{
     public void takesnap(){
         System.out.println("Taking snap");
     }

     public void recordvideo(){
         System.out.println("Recording in progress");

     }
     public String[] getNetworks() {
         System.out.println("Getting list of netwroks");
         String[] networklist = {"Shiva"};
         return networklist;
     }
     public void connectToNetworks(String networks){
         System.out.println("connecting to " + networks);

     }



 }



public class chw_57_interface_smartphone {
    public static void main(String[] args) {
        MySmartphone shiva = new MySmartphone();
        shiva.recordvideo();
        shiva.connectToNetworks("Rishabh");
        String[] ss = shiva.getNetworks();
        for(String item: ss){
            System.out.println(item);
        }

    }
}
