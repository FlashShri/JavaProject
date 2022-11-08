import java.util.Scanner;

class MultiArray{

public static void main(String[] args) {

    Scanner sc= new Scanner (System.in);
    //int[][] arr = { { 1, 2 }, { 3, 4 } };
    int [][] arr =new int[4][4];
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            arr[i][j]=sc.nextInt();
        }

        System.out.println();
    }
 
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.print(arr[i][j] + " ");
        }

        System.out.println();
    }
  sc.close();
}




}