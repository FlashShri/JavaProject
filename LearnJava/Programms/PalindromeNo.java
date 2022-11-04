import javax.sound.sampled.SourceDataLine;

/*
 * Palindrome Number
 * Palindrome number in java: A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. It can also be a string like LOL, MADAM etc.
 * 
 * Hold the number in temporary variable
  Reverse the number
  Compare the temporary number with reversed number
  If both numbers are same, print "palindrome number"
  Else print "not palindrome number"


  for reversing the no
  
 */
class PalindromeNo{

    public static void main(String[] args) {
        int r=0 , sum =0 ;
    int n=3458;

    while(n>0){
        r=n%10;
        sum= (sum*10)+r;
        n=n/10;
    }
    System.out.println(sum);
    }
}