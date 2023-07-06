// find largest span between 2 same digit

public class Set2arr10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,2,1,9,5,1,6,1, 5, 3, 2};
		int max_i = 0, max = 0;
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					max_i = j;
				}
			}
			if(max<max_i)
			{
				max = max_i;
			}
		}
			System.out.println(max);

	}

}
