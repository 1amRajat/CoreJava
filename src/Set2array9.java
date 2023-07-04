
public class Set2array9 {
	
	public void diff(int[] arr)
	{
		int min = arr[0], max = 0;
		int diffr;
		
		for(int i=0;i<arr.length;i++)
		{
			//min = arr[0];
			if(arr[i]> max)
			{
				max = arr[i];
			}
			else if(arr[i] <= min)
			{
				min = arr[i];
			}
		}
		diffr = (max-min);
		System.out.println(diffr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set2array9 st = new Set2array9();
		int[] input1 = {2,21,22,65,55};
		int[] input2 = {121,2,96,77,5};
		st.diff(input1);
		st.diff(input2);

	}

}
