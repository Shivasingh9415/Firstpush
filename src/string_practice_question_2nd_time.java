public class string_practice_question_2nd_time {
    public static void main(String[] args) {
//        StringBuilder name = new StringBuilder("Shiva");
//
//        for(int i =0; i<=name.length()/2; i++){
//            int front = i;
//            int back = name.length() - 1-i;
//
//            char frontchar = name.charAt(front);
//            char backchar = name.charAt(back);
//
//            name.setCharAt(front, backchar);
//            name.setCharAt(back, frontchar);
//        }
//        System.out.println(name);

        StringBuilder name = new StringBuilder("Shiva");
        for(int i =0; i<=name.length()/2; i++){
            int front = i;
            int back = name.length() -1-i;

            char frontchar = name.charAt(front);
            char backchar = name.charAt(back);

            name.setCharAt(front, backchar);
            name.setCharAt(back, frontchar);
        }
        System.out.println(name);


    }
}

