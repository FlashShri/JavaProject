import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        int [][]arr ;
        System.out.println("Enter no of rows and coloum");
        int row=sc.nextInt();
        int col=sc.nextInt();
        arr= new int[row][col];

        System.out.println("enter data:");

        for(int i=0 ; i<row ;i++){
            for(int j=0;j<col; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        
       for(int i=0 ; i<row ;i++){
        for(int j=0;j<col; j++){
           System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

    for(int i=0 ; i<arr.length ;i++){
        System.out.println(Arrays.toString(arr[i]));
    }

    for(int[] a : arr){
        System.out.println(Arrays.toString(a));
    }
        sc.close();








    }
    
}
