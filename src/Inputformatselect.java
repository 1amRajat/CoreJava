import java.util.Scanner;

public class Inputformatselect {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input_1 = sc.nextInt();
		int input_2 = sc.nextInt();
		int input_3 = sc.nextInt();
		
		getvalue(input_1,input_2,input_3);

	}
	
	public static void getvalue(int a, int b, int c)
	{
		int sum = 0;
		if (a==13)
		{
			if (c==13)
			{
				sum = sum;
			}
			else
			{
				sum = sum + c;
			}			
		}
		else if (b==13)
		{
			sum = sum + a;
		}
		else if (c==13)
		{
			sum = sum + a + b;
		}
		else
		{
			sum = sum + a+b+c;
		}
		System.out.println("Desired output =" + sum);
	}

}
