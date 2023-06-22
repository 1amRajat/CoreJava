//last 5 digits of input derives cust reading and input 3 is tariff. find the bill
public class Meterread6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "abc2012345";
		String input2 = "abc2112660";
		int input3 = 4;
		
		System.out.println((Integer.parseInt(input2.substring(5,10)) - Integer.parseInt(input1.substring(5,10)))* input3);

	}

}
