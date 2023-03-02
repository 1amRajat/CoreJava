import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hasmapfilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res =0, count= 0;
		HashMap <Integer, Integer> input = new HashMap <Integer, Integer>();
		input.put(1, 3);
		input.put(3, 3);
		input.put(2, 3);
		input.put(15, 6);
		
		Set st = input.entrySet();
		Iterator it = st.iterator();
		
		while(it.hasNext())
		{
			Map.Entry pair = (Map.Entry)it.next();
			if(Integer.parseInt(pair.getKey().toString())%2 != 0)
			{
				res = res + Integer.parseInt(pair.getValue().toString());
				count ++;
			}

		}
		System.out.println("The desired ans is " + (res/count));
		
	}

}
