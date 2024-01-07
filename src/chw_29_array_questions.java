public class chw_29_array_questions {
    public static void main(String[] args) {
        // practice problem 1....
      //ques1--> Create an array of 5 floats and calculate their sum...

        //first way to solve-->>

     /* float [] num = {34.5f , 56.4f, 34.6f, 67.9f, 100.1f};
        float sum = num[0]+num[1]+num[2]+num[3]+num[4];
        System.out.println(sum);*/

        //second way to solve-->>

       /* float [] marks = {23.4f, 67.9f, 67.7f, 34.5f, 1000.45f};
        float sum = 0;
        for(float element:marks){
            sum = sum +element;
        }
        System.out.println("The value of sum is "+ sum);  */

        //ques2--> Write a program to find out whether a given integer is present in an array or not...

       /* float[] marks = {23.4f, 56.6f, 87.3f, 45.8f};
        float num = 87.3f;
        boolean IsAnArray = false;
        for(float element : marks){
            if(num==element){
                IsAnArray = true;
                break;
            }
        }
        if(IsAnArray){
            System.out.println("The value is present in Array");
        }
        else{
            System.out.println("The value is not present in an array");
        }
        System.out.println(num); */








    }
}
