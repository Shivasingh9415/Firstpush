class Employee10{
    String name;
    int number;
    public void employeedetails(){
        System.out.println("My name is "+ name);
        System.out.println("My number is "+ number);
    }
}

public class oops_first_class {
    public static void main(String[] args) {
        System.out.println("This is our first custom class");
        Employee10 Shiva = new Employee10();
        Employee10 Mom = new Employee10();

//        setting attributes

        Shiva.name = "Shiva is the son of -->";
        Mom.name = "Mrs.Kalpana Singh";
        Shiva.number = 45;
        Mom.number = 30;



//        printing the attributes

        System.out.println(Shiva.name);
        System.out.println(Mom.name);

        Mom.employeedetails();

    }
}
