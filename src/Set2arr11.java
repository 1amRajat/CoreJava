// if elements are no add it else -1
public class Set2arr11 {
	
	public int check(String[] arr)
	{
		int output, inter = 0;
		for(int i =0; i< arr.length; i++)
		{
			char c = arr[i].charAt(0);
			if(Character.isDigit(c))
			{
				inter = inter + Integer.parseInt(arr[i]);
			}
			else
			{
				inter = -1;
				break;
			}
		}
		output = inter;
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set2arr11 st = new Set2arr11();
		String[] input1 = {"1","6","2","85"};
		String[] input2 = {"1","6","s","5"};
		System.out.println(st.check(input1));
		System.out.println(st.check(input2));
		System.out.println("check");
		

	}

}
