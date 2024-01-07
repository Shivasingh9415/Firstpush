import java.util.*;
public class dd_arrays_problem_problem_Solving {

    static void printSpiral(int[][] matrix, int r, int c){
        int toprow= 0, bottomrow = r-1, leftcolumn= 0, rightcolumn = c-1;
        int totalelements = 0;
        while(totalelements< r*c){
//            toprow = leftcolumn to rightcolumn
            for(int j = leftcolumn; j<= rightcolumn && totalelements< r*c ; j++){
                System.out.print(matrix[toprow][j]);
            }
            toprow++;


//            rightcolumn = toprow to bottomrow
            for(int i =toprow; i<=bottomrow && totalelements< r*c ; i++){
                System.out.print(matrix[i][rightcolumn]);
            }
            rightcolumn--;


//            bottomrow = rightcolumn to leftcolumn
            for(int j= rightcolumn; j>= leftcolumn && totalelements< r*c ; j--){
                System.out.print(matrix[bottomrow][j]);
            }
            bottomrow--;



//            leftcolumn = bottomrow to toprow
            for(int i = bottomrow; i>= toprow && totalelements< r*c ; i--){
                System.out.print(matrix[i][leftcolumn]);
            }
            leftcolumn++;

        }
    }

    static void printMatrix(int[][] matrix ){
        for(int i=0; i<matrix.length; i++){
            for(int j =0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter the elements: ");
        for(int i =0; i<r; i++){
            for(int j =0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("our given matrix is: ");
        printMatrix(arr);

        printSpiral(arr,r,c);

        System.out.println("Spiral of given matrix is: ");



        
    }
}
