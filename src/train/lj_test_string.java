package train;


public class lj_test_string {
	public static void main(String[] args) {
		String str = "Now is the winter of our discontent";
		
		System.out.println("The String is: " + str);
		System.out.println("Length of this string : " + str.length());
		System.out.println("The Character at position 5: "+ str.charAt(5));
		System.out.println("The Substring from 11 to 18: "+ str.substring(11, 18));
		System.out.println("The index of the character d: "+ str.indexOf('d'));
		System.out.println("The index of the begining of the ");
		System.out.println("Substring \"Winter\" : " + str.indexOf("winter"));
		System.out.println("The string in upper case: " + str.toUpperCase());
	}
}
