
public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "xyzwabcd";
		int input_2 = 2;
		int input_3 = 4;
		//expected output = bawz
				
		String interim = input.substring(input_2,(input_2+input_3));
		//System.out.println(interim);
		StringBuilder sb = new StringBuilder(interim);
		//sb.reverse();
		System.out.println(sb.reverse().toString());
		

	}

}
