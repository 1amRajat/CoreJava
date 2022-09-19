
public class Arraysum {
	static String[] input = {"abc","123","ab1","5gs","5"};
	static String word = "";
	static int sum =0;
	static char c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<input.length;i++) {
			word = input[i];
			//System.out.println(word);
			for(int j=0; j<word.length();j++)
			{
				//System.out.println(word.charAt(j));
				if (Character.isDigit(word.charAt(j)))
				{
					System.out.println(word.charAt(j));
					sum = sum + Character.getNumericValue(word.charAt(j));
					System.out.println(sum);
				}
				
			}
			
		}
		System.out.println("Desired output " + sum);
	}

}

//Char to int conversion >> Character.getNumericValue(word.charAt(j))
//Char to String conversion >> String.valueOf(c)
//String to int >> Integer.parseInt(S)
