import java.util.ArrayList;
import java.util.Scanner;

public class  Stringformat{
	
	private String input;

	public Stringformat(String input)
	{
		this.input = input;
		
	}
	
	public void identify()
	{
		if(input.contains("|"))
		{
			ArrayList<String> str = new ArrayList<String>();
			String[] val = input.split("\\|");
			for(String itr : val)
			{
				System.out.println(itr);
				str.add(itr);
			}
			System.out.println(str.get(0));
			System.out.println(str.get(1));
			if(str.get(0).equals(str.get(1)))
			{
				System.out.println("Valid scenario");
			}
			else
			{
				System.out.println("Contains | but not identical");
			}
		}
		else
		{
			System.out.println("Not Valid");
		}
	}
	
	public static void main(String[]args)
	{
		Stringformat sf = new Stringformat("abc|abc");
		sf.identify();
	}

}

