import java.util.*;;
public class FindForx {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("enter the no of rows and colomn: ");
       int r= sc.nextInt();
       int c= sc.nextInt();
        int arr[][]= new int[r][c];
       System.out.println("enter the data in matix ");

       // for entering the data in matix
        
       for( int i=0;i<r;i++){
        for (int j=0;j<c;j++){
            arr[i][j]=sc.nextInt();
        }
        System.out.println();
       }
       System.out.println(" matrix updation succesfull");

       System.out.println("enter the data you want the search in matix");
       int x=sc.nextInt();

       for(int i=0; i<r;i++){
        for(int j=0;j<c;j++){

            if(arr[i][j]==x){
                System.out.println("Your data is at row:"+i+" and colomn: "+j);
            }
            }
        }
       }

    }

    /*
     * if we enter mutltiple same entries then it will give all the position of that entry
     */
