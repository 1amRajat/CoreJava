
public class Maxchunkstring {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "this isss sooooo good";
		int max =0, count =0;
		String[] interim = input.split(" ");
		for(int i=0; i<interim.length; i++)
		{
			System.out.println(interim[i]);
			for(int j=0; j<interim[i].length()-1; j++)
			{
				count =1;
				for(int k=j+1; k<interim[i].length();k++)
				{					
					if(interim[i].charAt(j)==interim[i].charAt(k))
					{
						count ++;
					}
				}
				if(count>max)
				{
					max = count;
				}
			}
		}
		System.out.println(max);
		

	}

}
