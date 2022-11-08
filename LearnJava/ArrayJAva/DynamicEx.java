import java.util.Arrays;

public class DynamicEx {
    public static void main(String[] args) {
       int[][] arr = {

        {2,4,6,8},
        {1,3,5},
        {0,5,10,15,20}
       } ;

       for(int i=0 ; i<arr.length;i++){
        for (int j =0 ;j<arr[i].length; j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
     }
    }
}
