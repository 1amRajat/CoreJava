
public class Panverify {
	
	public void validate(String input)
	{
		String flag = "";
		if(input.length()==8)
		{
			char[] val = input.toCharArray();
			for(int i=0; i<val.length;i++)
			{
				if((i>=0 && i<3)|| (i ==7))
				{
					if(Character.isUpperCase(val[i]))
					{
						flag = "True";				
					}
					else
					{
						flag = "False";
						break;
					}
				}
				else
				{
					if(Character.isDigit(val[i]))
					{
						flag = "True";
					}
					else
					{
						flag = "False";
						break;
					}
				}
			}
			if(flag == "True")
			{
				System.out.println("Valid Number");
			}
			else
			{
				System.out.println("Invalid Number #");
			}
		}
		else
		{
			System.out.println("Invalid number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Panverify pb = new Panverify();
		pb.validate("ABC1234D");

	}

}
