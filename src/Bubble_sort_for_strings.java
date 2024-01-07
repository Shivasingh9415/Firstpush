public class Bubble_sort_for_strings {
    public static void main(String[] args) {
        String name[] = {"Shiva","Kalpana","Deepali","Dharmendra"};
        String temp;
        for(int i=0; i<name.length; i++){
            int flag =0;
            for(int j =0; j<name.length-1-i; i++){
                if(name[j].compareTo(name[j+1])>0){
                    temp = name[j];
                    name[j]= name[j+1];
                    name[j+1] = temp;
                    flag = 1;



                }

            }
            if(flag == 0){
                break;
            }
        }
        for(int i=0; i<name.length; i++){
            System.out.print(name[i] + ' ');
        }
    }
}
