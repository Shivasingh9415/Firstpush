import java.util.*;
public class DD_Arrays_Why_College_Wallah {

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2 , int c2){
        if(c1 != r2) {
            System.out.println("Multiplication is not possible - wrong dimension  ");
            return;
        }
        else{
            int[][] mul = new int[r1][c2];

            for(int i=0; i<r1; i++){
                for(int j=0; j<c2; j++){
                    for(int k =0; k<c1; k++){
                        mul[i][j] += (a[i][k] * b[k][j]);
                    }
                }
            }

            System.out.println("Multiplication of matrix: ");
            printMatrix(mul);



        }
    }

    static void printMatrix(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for matrix 1 : ");
        int r1 = sc.nextInt();
        System.out.println("Enter number of columns for mmatrix 2 : ");
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];

        System.out.println("Enter the elements of matrix 2: ");
        for(int i =0; i<r1; i++){
            for(int j =0; j<c1; j++){
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println("Enter the number of rows for matrix 2 :");
        int r2 = sc.nextInt();
        System.out.println("Enter the number of columns for matrix 2 : ");
        int c2 = sc.nextInt();
        int[][] arrr = new int[r2][c2];

        System.out.println("Enter the elements of matrix 2: ");
        for(int i =0; i<r2; i++){
            for(int j=0; j<c2; j++){
                arrr[i][j] = sc.nextInt();
            }
        }

        multiply(arr, r1,  c1,  arrr , r2, c2 );




//        printArray(arr);

//        int[][] a = new int[5][4];
//        int[][] b = {{1,2,3},{2,3,4},{4,5,6}};


    }
}
