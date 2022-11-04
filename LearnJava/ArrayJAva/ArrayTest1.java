

public class ArrayTest1 {
    // multidirectional Arrays

    /*
     *   0  1  2  3  4
     * 0 ~  ~  ~  ~  ~
     * 1 
     * 2
     * 3
     * 4
     * 
     */

    public static void main(String[] args) {
     //this is 2D Array
     String data[][]= new String[2][2]; // two rows and two colomn

     data[0][0]="TataMotors";
     data[0][1]="Cars";
     data[1][0]="SpaceX";
     data[1][1]="Rockets";

  //  String comp[][] ={{"TataMotors","Cars"},{"SpaceX","Rockets"}};
 
    //System.out.println(data[1][1]);
     //Traversing the 2 D array
 
     for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.println(data[i][j]+" ");
        }
     }   
    }
   


}
