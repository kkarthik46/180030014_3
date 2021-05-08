/*Characters ->''->Wrapper class
 * Character c=new Character('a');
 * Boxing
 * Method:
 * isLetter()->conditional statement-->boolean value
 * isDigit()->is a digit or not-->boolean value
 * isWhitespace()->used to find the space,tab,new line, [9]->Ascii value of the tab
 * toUpperCase()->convert lower to upper
 * toLowerCase()->convert upper to lower
 * isUpperCase()->identify the upper case letter
 * isLowerCase()->identify the lower case letter
 * 
 * is ----->boolean -->condition
 * 
 * 
 * Conversion:
 * char to string-->toString()
 * */


package prcatice;

public class Practice {
	
	// main + cntl+ space bar
	public static void main(String[] args) {
		Character c=new Character('c');
		char ch=c;
		String s=Character.toString(ch);
		System.out.println(s);
	}
	

}
