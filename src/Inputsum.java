
public class Inputsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 99998;
		int sum = 0;
		
		while(input>10)
		{
			sum = sum + input%10;
			input = input/10;
			
			if(input <10 && sum > 10)
			{
				sum = sum + input;
				input = sum;
				//System.out.println(input);
				//System.out.println(sum);
				sum = 0;
			}
			
			if(input<10 && sum <10)
			{
				sum = sum + input;
				input = sum;
			}
			
			
		}
		System.out.println(sum);
	}

}
