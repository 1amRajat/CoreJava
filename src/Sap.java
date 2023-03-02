import java.util.ArrayList;

public class Sap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int len = 6;
		int key =34;
		String input = "11 12 13 14 34 9";
		
		String [] in_it = input.split(" ");
		
		for(int i =0; i<len;i++)
		{
			ar.add(Integer.parseInt(in_it[i]));
			if(Integer.parseInt(in_it[i]) == key)
			{
				System.out.println("true");
			}
		}

	}

}
