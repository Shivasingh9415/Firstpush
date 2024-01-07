public class loops_java_forever_playlist_1 {

//    ques 1 --> Write a program which prints the even numbers between 1 and 100 in an increasing order.



    public static void main(String[] args) {

        int count = 0;
        System.out.println("Even numbers between 1 and 100 are as follows: ");
        for(int i= 1; i<=100;i++){
            if(i%2 == 0){
                count++;
                System.out.println(i);
            }
            else{
                continue;
            }
        }
        System.out.println("Total number of elements are: " + count);

    }
}
