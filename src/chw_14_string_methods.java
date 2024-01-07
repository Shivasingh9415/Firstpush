public class chw_14_string_methods {
    public static void main(String[] args) {
        String name = "Shivendra Singh";
        System.out.println(name);

        // to print the length of string.....


        int value = name.length();
        System.out.println(value);

        // to print the string in lowercase....

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        // to uppercase

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        //triming all the spaces between string numbers
        // for triming all the wide spaces around the string name......

        String trim = name.trim();
        System.out.println(trim);

        // substring matlab jo value hm dalenge waha se string ki index value se string print hona start hogi..

        System.out.println(name.substring(3));

        // second type of subsring jisme start to given value se hoga but end ek value phle pr hoga..

        System.out.println(name.substring(0,14));

        // name replace krne ki string...

        System.out.println(name.replace('i','e'));
        System.out.println(name.replace("Sin","son"));

        // name starts with or ends with (true or false type).....

        System.out.println(name.startsWith("Shi"));
        System.out.println(name.startsWith("son"));
        System.out.println(name.endsWith("gh"));

        // name.charAt(.)-->> returns value at any index point in strinig...

        System.out.println(name.charAt(10));

        // name.indexOf("") -->> returns the index at given string...

        System.out.println(name.indexOf("r"));

        // from a given index find the string..

        System.out.println(name.indexOf("S",1));









    }
}
