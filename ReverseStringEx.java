public class ReverseStringEx {

    public static String reversString(String s) // getting string as argument
	{
		
		char c[]=s.toCharArray(); //converting the string into char array
		String emptystring="";     // empty string for puttiing reverse char
		for(int i=s.length()-1; i>=0 ; i--) // reverse loop from endindex to 0 
		{
			emptystring =emptystring+c[i];  // putting endindex char in String first
		}
		return emptystring;     
	}
	
	public  static StringBuilder reverseStringSb(String s) {
		/* here we will put front char at endindex and 
		 * end char at frontindex
		 * so we only need to loop upto half index
		 */
		
		StringBuilder sb = new StringBuilder(s);
		
		for ( int i=0; i<sb.length()/2 ;i++)   
		
		{
			int frontcharindex = i;
			int endcharindex= sb.length()-1-i;
			
			char front= sb.charAt(frontcharindex);
			char end = sb.charAt(endcharindex);
			
			sb.setCharAt(frontcharindex, end);  // setting frontchar at end
			sb.setCharAt(endcharindex, front);  // SETTING ENDchar at front
			
		}
		 return sb;
	}
	
	public static StringBuffer reversrStringSbf(String s) {
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		return sb;
	}
	public static void main(String[] args) {

		System.out.println(ReverseStringEx.reversString("Hi my name is Shrikant!!"));
		System.out.println(ReverseStringEx.reverseStringSb("This is reverse using sb"));
		System.out.println(ReverseStringEx.reversrStringSbf("Virat is King!!"));
	}
    
}
