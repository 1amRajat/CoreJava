
public class Arraytostr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] input = {"India","China","Mayanmar"};
		String output;
		StringBuilder sb = new StringBuilder();
		
		for(int i =0; i<input.length;i++)
		{
			sb.append(input[i]).append(",");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println("{" + sb + "}");
	}

}
