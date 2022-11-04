public class BankingDemo{

    // programm to demonstrate the working of bank
    // we need some fileds for account holder
    String ac_HolderName;
    long ac_Number;
    long amountBalance;

    //initialise the fileds
    public void insertData(String name,long acno ,long acBal){
        ac_HolderName=name;
        ac_Number=acno;
        amountBalance=acBal;
    }
    
    // method to check balance
    public void checkBalance(){
        System.out.println("Your Account balance is "+amountBalance +" $");
    }

    //method to deposite amount in Ac
    public void deposite(int amt){
        amountBalance=amountBalance+amt;
        System.out.println("Amount Deposited");
        System.out.println("Your Account balance is "+amountBalance+ " $");
        
    }

    //method to withdrawn amount 
    public void withdrawn(int amt){

        if(amountBalance<amt){
            System.out.println("Insufficiant Balance");
        } else if(amountBalance==amt){
            System.out.println("amount withdrawn");
            amountBalance=amountBalance-amt;
            System.out.println("Your Account balance is "+amountBalance+ " $");
            System.out.println("Your Balance is low for further BAnking PLz Add Funds Immedialaty");

            

        }
        else{
            System.out.println("amount withdrawn");
            amountBalance=amountBalance-amt;
            System.out.println("Your Account balance is "+amountBalance+" $");
            
        }
    }

    // method to shown ths info of account holder
    public void showData(){

        System.out.println("Ac Holder name :"+ac_HolderName+"\n"+"Ac No :"+ ac_Number+"\n"+"Your balcance :"+amountBalance +" $");
    }

    public static void main(String[] args) {
        BankingDemo h1 = new BankingDemo();
        h1.insertData("Elon Musk",868668 , 434343);

        h1.checkBalance();
        h1.withdrawn(4545);
        h1.deposite(3333);
        h1.showData();
    }

}