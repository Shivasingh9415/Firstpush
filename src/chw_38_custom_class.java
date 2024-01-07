

    class Employee{
        int iD;
        String name;
        public void printDetails(){
            System.out.println("my id is " + iD);
            System.out.println(" and my name is " + name);

        }

    }
    public class chw_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee harry = new Employee();
        harry.iD = 3;
        harry.name = "shiva";
       // System.out.println("my iD is " + harry.iD);
        harry.printDetails();


    }
}
