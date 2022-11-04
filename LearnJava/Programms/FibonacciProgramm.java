/*
 * Fibonacci Series:
 * 0,1,1,2,3,5,8,13,21,34,55
 * -here every next no is sum of previous two numbers
 * -First two digits will starts with 0,1,....
 * -
 * 
 * n1(first no) ,n2(sec no), n3(third no)
 * to get thrid no
 * n3=n1+n2;
 * and for next itretion
 * n1 will be n2 and n2 will be n3..
 * so we can make a for loop and print n3 bcoz n3 will always be sum previous two numbers
 */

 class FibonacciProgramm{

   static  void printFibonacciNos(int c){
        int n1=0;
        int n2=1;
        int n3;
        //first two nums are fixed\
        System.out.print(n1+" "+n2);

        for(int i=2;i<c;i++){
            n3= n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println(" ");

    }

    public static void main(String[] args) {
        FibonacciProgramm.printFibonacciNos(15);
        SecondApproach.printFibonacciNos(10
        );
    }
 }

 class SecondApproach{
   static int n1=0;
    static int n2=1;
    static int n3;
    static void printFibonacciNos(int c){

        if(c>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print("0 1 "+n3);
            printFibonacciNos(c-1);  // ********
        }
    }
 }

