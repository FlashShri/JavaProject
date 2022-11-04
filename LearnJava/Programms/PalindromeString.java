import java.util.Scanner;;
public class PalindromeString {

    public static void main(String[] args) {
        String original , reverse="" ;
        System.out.println("Enter Your String :");
    
    Scanner sc= new Scanner(System.in);
        original = sc.nextLine();

       
    
        for(int i=original.length()-1; i>=0; i--){
    
            reverse=reverse+original.charAt(i);
    
        }
        if(original.equals(reverse)){
        System.out.println(original+ " is a palindrome String " ); }
        else{
            System.out.println(original+" is not palindrome String :"+ reverse);
        }
        sc.close();
    }
    




}
