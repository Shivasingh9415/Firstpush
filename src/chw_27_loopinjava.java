public class chw_27_loopinjava {
    public static void main(String[] args) {
        float [] marks = {23.5f, 45.5f, 56.5f, 78.5f, 90.5f };

        //System.out.println(marks[0]);

        /*String [] students = {"Shiva", "Rohan", "Akash", "Supriya"};
        System.out.println(students.length);*/

        // Printing arrays using for loop....*******
       // quick quiz -->>> // Printing arrays in decrementing order....*****

        /*for(int i = marks.length - 1 ; i>=0 ; i--){
            System.out.println(marks[i]); //--> Array Transversal....
        }*/

        // For each loop in java...********

        System.out.println("Printing using for each loop");
        for(float element: marks){
            System.out.println(element);
        }







    }
}
