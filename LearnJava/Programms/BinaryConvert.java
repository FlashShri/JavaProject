import java.util.Scanner;

public class BinaryConvert{

    // convert Integer to bInary
public static void main(String[] args) 
{
    // int num =45 ;
    // int temp=num ;
    // int n=0;
    // int rim[]= new int[35];
    // while(temp>0){
    //     rim[n++]=temp%2;
    //     temp=temp/2;
    // }

    // for(int i =n-1;i>=0;i--){
    //     System.out.print(rim[i]+" ");
    //   }
    System.out.println("Enter the positive Integer to convert into Binary: ");
Scanner sc = new Scanner(System.in);
int num=sc.nextInt();
convertToBinary(num);
sc.close();
}
    static void convertToBinary(int n){
        int bin[] = new int[40];  // take a empty array
        int index=0;      // we don't know the total size yet
        while(n>0){        
            bin[index++]=n%2;  // store the modulo in array and increase the index
            n=n/2;     //div by 2 bcoz the binary th base 2 num system
        }

        for(int i=index-1;i>=0;i--)  // traversing the array in opposite
        {
            System.out.print(bin[i]+" ");
        }
    }
}