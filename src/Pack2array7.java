//array of integers,print the sum of elements squaring/cubing as per the power of their indices 


public class Pack2array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2,3,5};
		int sum = 0;
		
		for(int i=0;i<input.length;i++)
		{
			sum = (int) (sum + Math.pow(input[i], i));
		}
		
		System.out.println(sum);
	}

}
