import java.util.Scanner;

public class Numericinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 0;
		int op = 0;
		Scanner sn1 = new Scanner(System.in);
		Scanner sn2 = new Scanner(System.in);
		Scanner sn3 = new Scanner(System.in);
		
		int input1 = sn1.nextInt();
		int input2 = sn2.nextInt();
		int input3 = sn3.nextInt();
		
		if(input1 != input2 && input3 != input2 && input1 != input3)
		{
			op = input1 + input2 + input3;
		}
		else if(input1 == input2 && input3 == input2 && input1 == input3)
		{
			op = 0;
		}
		else if(input1 == input2)
		{
			op = input3;
		}
		else if(input3 == input2)
		{
			op = input1;
		}
		else if(input1 == input3)
		{
			op = input2;
		}
	
		System.out.println("Desired output is : " + op);

	}

}
