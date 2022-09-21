
public class Swapstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello World";
		StringBuilder sb = new StringBuilder();
		
		sb.append(input.substring(input.length()-1));
		sb.append(input.substring(1, input.length()-1));
		sb.append(input.substring(0, 1));
		
		System.out.println(sb.toString());

	}

}
