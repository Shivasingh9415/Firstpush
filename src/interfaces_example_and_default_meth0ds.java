interface Mycamera{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kvideo(){
        greet();
        System.out.println("Recording in 4k type");
    }
}
interface wifi{
    String[] getnetworks();
    void connecttonetwork(String network);
}

class MYcellphone{
    void callnumber(int phonenumber){
        System.out.println("Calling"+ phonenumber);
    }

    void pickcall(){
        System.out.println("Picking call");
    }
}

class MYsmartphone extends MYcellphone implements wifi, Mycamera{
    public void takesnap(){
        System.out.println("Taking snap");
    }
    public void recordvideo(){
        System.out.println("Recording 4k video...");
    }
    public String[] getnetworks(){
        String[] networklist = {"Shiva","Singh"};
                return networklist;
    }
    public void connecttonetwork(String network){
        System.out.println("Connecting to "+network);
    }
}



public class interfaces_example_and_default_meth0ds {
    public static void main(String[] args) {
        MYsmartphone smart = new MYsmartphone();
        smart.takesnap();
        smart.connecttonetwork("wifi");
        smart.record4kvideo();
        String[] ar = smart.getnetworks();
        for(String item :ar){
            System.out.println(item);
        }
//        smart.greet();--> we cannot use greet method directly byt can use in default methods

    }
}
