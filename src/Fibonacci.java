
public class Fibonacci {
	
	public void method_feb(int a, int b, int ser_len)
	{
		int c = 0;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for (int i = 0; i < ser_len; i++)
		{
			c =  a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fb = new Fibonacci();
		fb.method_feb(2, 3, 8);
	}

}
