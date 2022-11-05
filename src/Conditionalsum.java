import java.util.Scanner;

public class Conditionalsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn_1 = new Scanner(System.in);
		Scanner sn_2 = new Scanner(System.in);
		Scanner sn_3 = new Scanner(System.in);
		
		int input_1 = sn_1.nextInt();
		int input_2 = sn_2.nextInt();
		int input_3 = sn_3.nextInt();
		
		int output_sum;
		
		if (input_1 == 13)
		{
			output_sum = input_3;
		}
		else if (input_2 == 13)
		{
			output_sum = input_1;
		}
		else if (input_3 == 13)
		{
			output_sum = input_1 + input_2;
		}
		else 
		{
			output_sum = input_1 + input_2 + input_3;
		}
		
		System.out.println("The desired sum is "+ output_sum);

	}

}
