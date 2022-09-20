
public class Arraylastitem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] input = {"Txt","Mm","Pqr","Qp"};
		String output;
		StringBuilder sb = new StringBuilder();
		char c;
		
		for(int i =0; i<input.length;i++)
		{
			if(input[i].length()==3)
			{
				sb.append(input[i].charAt(2)).toString();
			}
			else
			{
				sb.append("$").toString();
			}
		}
		output = sb.toString();
		System.out.println(output);

	}

}
