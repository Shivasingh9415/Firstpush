

public class arrays_new_college_wallah {
    public static void main(String[] args) {
        int [] ages = new int[4];
        ages[0] = 1;
        ages[1] = 2;
        ages[2] = 3;
        ages[3] = 4;

        for(int i = 0; i<4; i++){
            System.out.println(ages[i]);
        }

        for(int age : ages){
            System.out.println(age);
        }

        int i =0;
        while(i<4){
            System.out.println(ages[i]);
            i++;
        }

    }
}
