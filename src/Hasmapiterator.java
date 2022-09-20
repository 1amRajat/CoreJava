import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hasmapiterator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> input = new HashMap<String,String>();
		input.put("India", "Asia");
		input.put("France", "Europe");
		input.put("China", "Asia");
		ArrayList <String> ar = new ArrayList<String>();
		
		Set input_s = input.entrySet();
		Iterator it = input_s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry pair =  (Map.Entry)it.next();
			if(pair.getValue() == "Asia")
			{
				ar.add((String) pair.getKey());
			}
			
		}
		
		System.out.println(input);
		System.out.println(ar);

	}

}
