
public class Maxlenword {
	
	public void maxlen(String input)
	{
		String res = null;
		int length =0;
		int length_f = 0;
		String [] interim = input.split(" ");
		for(String x : interim)
		{
			length = x.length();
			//System.out.println(length);
			//System.out.println(length_f);
			if(length>length_f)
			{
				length_f = length;
				res = x;
			}
		}
		System.out.println("Max length str is: " + res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maxlenword mx = new Maxlenword();
		mx.maxlen("this is anthony jr");
		

	}

}
