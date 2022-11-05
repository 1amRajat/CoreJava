
public class Stringofstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"ab","abc", "ac","hgf","acb", "hgfx"};
		int sum = 0;
		for(int i=0;i<input.length;i++)
		{
			for(int j=i+1; j<input.length;j++)
			{
				if(input[j].startsWith(input[i]))
				{
					sum++;
				}
			}
		}
		System.out.println(sum);

	}

}
