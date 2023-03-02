import java.util.Scanner;

public class Stringcase {
	
	public void appendstr(String input1, String input2)
	{
		if(input1.length()==input2.length())
		{
			String result = input1 + input2;
			System.out.println(result);
		}
		else
		{
			System.out.println("Not applicable");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first num: ");
		Scanner sn1 = new Scanner(System.in);
		
		Scanner sn2 = new Scanner(System.in);
		String in1 = sn1.nextLine();
		System.out.println("Enter second num: ");
		String in2 = sn2.nextLine();
		Stringcase sc = new Stringcase();
		sc.appendstr(in1, in2);

	}

}
