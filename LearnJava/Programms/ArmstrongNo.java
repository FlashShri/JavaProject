import java.lang.Math;
public class ArmstrongNo {

    public static void main(String[] args) {
        int num=153;
        int last_digit=0;
        int total_digit=0;
        int sum=0;
        int temp=num;
        while(temp>0){
    
            temp=temp/10;
            total_digit++;
        }
        temp=num;

        while(temp>0){

            last_digit =temp%10;
           // System.out.println(last_digit);
            sum += Math.pow(last_digit, total_digit);

            temp=temp/10;
        }

        if(num==sum){
            System.out.println(num+" is armstrong no");
        }else
        {
            System.out.println(num+" is not armstrong no");
        }
        
    }
    


}
