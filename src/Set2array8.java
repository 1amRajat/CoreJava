// in array of string check all elements contain only digits not alphabates
public class Set2array8 {
	
	public void validate(String[] arr)
	{
		int flag = 0;
		for(int i =0; i<arr.length; i++)
		{
			
			char[] ch = arr[i].toCharArray();
			for(int j=0; j<ch.length; j++)
			{
				if(Character.isDigit(ch[j]))
				{
					
				}
				else
				{
					flag = 1;
					break;
				}
			}
			if(flag == 1)
			{
				System.out.println("Not Valid");
				break;
			}
		}
		if(flag ==0)
		{
			System.out.println("Valid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] input1 = {"a123","456","789"};
		String [] input2 = {"12","v45","789"};
		
		Set2array8 st = new Set2array8();
		st.validate(input2);
		st.validate(input1);
		

	}

}
