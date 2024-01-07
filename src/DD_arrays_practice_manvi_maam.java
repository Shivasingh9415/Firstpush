import java.util.*;
public class DD_arrays_practice_manvi_maam {


//    Given a square matrix, turn it by 90 degree in a clockwisw direaction
//    without using extra space.

    static void findInPlaceTranspose(int[][] matrix, int r, int c){
        for(int i=0; i<c; i++){
            for(int j =i; j<r; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void reverseInPlace(int[] arr){
        int i=0;
        int j = arr.length -1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

//    static void rotateMatrix(int[][] matrix, int n){
//        findInPlaceTranspose(matrix, n, n);
//        for(int i=0; i<n; i++){
//            reverseInPlace(matrix[i]);
//        }

//    }





    static int[][] findTranspose(int[][] matrix, int r, int c){
        int[][] ans = new int[c][r];

        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i, int j){
        while(i>j){
            swap(arr, i, j);
            i++;
            j--;

        }
    }


//    static void findInPlaceTranspose(int[][] matrix, int r, int c){
//        for(int i=0; i<c; i++){
//            for(int j= i; j<r; j++){
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//
//            }
//
//        }
//    }

    static void printMatrix(int[][] arr){
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++ ){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

//    Given an integer n, return the first n rows of pascals triangle.
//    In pascals triangle, each number is the sum of the two numbers directly
//    above as shown

    static int[][] pascal(int n){
        int[][] ans = new int[n][];

        for(int i =0; i<n; i++){
            // ith row has i+1 columns.
            ans[i] = new int[i+1];
//            1st and last element is equal to 1.
            ans[i][0] = ans[i][i] = 1;
//            applying the formulae is the 3rd step
            for(int j =1; j<i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }






    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of pascals triangle you want to print: ");
        int n = sc.nextInt();
        int[][] ans = pascal(n);
        printMatrix(ans);









//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows: ");
//        int r = sc.nextInt();
//        System.out.println("Enter the number of columns: ");
//        int c = sc.nextInt();
//        int[][] arr = new int[r][c];
//
//        System.out.println("Enter the elements: ");
//        for(int i=0 ; i<r; i++){
//            for(int j =0; j<c; j++){
//                arr[i][j] = sc.nextInt();
//            }
//
//        }

//        System.out.println("Our given matrix is: ");
//        printMatrix(arr);
//        findInPlaceTranspose(arr, r, r);
//        for(int i=0; i<r; i++){
//            reverseInPlace(arr[i]);
//        }
//        System.out.println("required matrix: ");
//        printMatrix(arr);
//        findInPlaceTranspose(arr, r, c);






//        System.out.println("Transpose of given matrix is: ");
//        findInPlaceTranspose(arr , r,c);
//        printMatrix(arr);
//        int ans [][] = findTranspose(arr , r, c);
//        printMatrix(ans);




    }

}
