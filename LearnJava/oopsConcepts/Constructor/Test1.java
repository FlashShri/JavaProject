package Constructor;

public class Test1 {
    

   static int id;
   static String userName;
   static String designation;

    Test1( int id , String userName , String designation){
        this.id=id;
        this.userName=userName;
        this.designation=designation;
    }

    public static void showData(){
        System.out.println("Displaying User Data: ");
        System.out.println("ID :"+ id);
        System.out.println("User Name :"+ userName);
        System.out.println("Designation :"+ designation);

    }

}
