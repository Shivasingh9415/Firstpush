public class Leetcode_practice_questions {

    static int duplicacy(int[] arr){
        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[j] != arr[i]){
                    arr[++j] = arr[i];
                }
            }
        }
        return 1;
    }


    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,3,4,5,6,7};
        int ans = duplicacy(arr);
        System.out.println(ans);


    }
}
