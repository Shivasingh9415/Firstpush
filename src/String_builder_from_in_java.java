public class String_builder_from_in_java {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Shiva");
        System.out.println(sb);

//        char at index 0

        System.out.println(sb.charAt(0));

//        set char at given index

        sb.setCharAt(1,'p');
        System.out.println(sb);

//        Inserting at any index
        sb.insert(0,'S');
        System.out.println(sb);

//        deleting in String

        sb.delete(2,3);
        System.out.println(sb);

//        Appending in String

        StringBuilder se = new StringBuilder("h");
        se.append('e');
        se.append('l');
        se.append('l');
        se.append('o');
        System.out.println(se);

//        reversing the string

        StringBuilder sk = new StringBuilder("Hello");
        for(int i =0; i<sb.length()/2; i++ ){
            int front = i;
            int back = sb.length()-1-i;

            char frontchar = sk.charAt(front);
            char backchar = sk.charAt(back);

            sk.setCharAt(front, backchar);
            sk.setCharAt(back, frontchar);

        }

        System.out.println(sk);
        






    }
}
