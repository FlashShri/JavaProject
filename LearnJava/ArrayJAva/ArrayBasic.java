/*Array in java is collection of elements with similar dataTpye.
The elements of an array are stored in a contiguous memory location.

index based , fixed size(can't increase during runtime) ~ (collection framework has size can increase)

$$ In Java, array is an object of a dynamically generated class

 */

 public class ArrayBasic{
public static void main(String[] args) {
    // declaration of array : dataType[] arr;
    int[] arr1;
   // int []arr2;
    //int arr3[];

    // instantiation

    arr1= new int[10]; // 10 is size

    // initialization
    arr1[0]=76;
    arr1[1]=22;
    arr1[2]=222;

    //traversing

    for(int i=0 ; i<arr1.length; i++){
        System.out.print(arr1[i]+" ");
    }

    //declaration, instantiation and initialization 
    char ch[]={'s','d','s','d'};

    for(int i=0 ;i<ch.length ;i++){
        System.out.println(ch[i]);
    }

    //for each loop for traversing

    for(int i:arr1){
        System.out.println(i);
    }

}
    

    


 }