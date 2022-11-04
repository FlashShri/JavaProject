/*
 * Prime Number
 * Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words, prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 * 
 * 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.
 * 
 */

 class PrimeNumber{
 
    static void checkPrime(int num){
        int a=num/2;
        int notifi=0;
        for(int i=2 ;i<=a;i++){

            if(num%i==0){
                System.out.println("Your number is not prime "+num);
                 notifi=1; 
                /*it will check all num upto n\2 if it get div by then the nitifi will store 1 , so that we  can know the the no is not prime, we can use this notifi for getting the prime*/
                break;
            }

            if(notifi==0){
                System.out.println(num+ " is prime number");
            }
        }
    }

    
    

 }

 class PrimeSecondApporach{
    
    static void checkPrime(int num)
    {
        
        if(num<=1){
            System.out.println("no is not prime");
        }else {
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    System.out.println("no is not prime");
                }else{
                    System.out.println(num+" is prime");
                }
            }
        }
    }
 }

 //driver class
 class RunProgramm{
    public static void main(String[] args) {
        PrimeNumber.checkPrime(14);
        PrimeSecondApporach.checkPrime(13);
    }
 }