import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmapone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> input = new HashMap<String, Integer>();
		HashMap<String, String> output = new HashMap<String, String>();
		
		input.put("Stu1", 60);
		input.put("Stu2", 45);
		input.put("Stu3", 55);
		
		System.out.println(input);
		Set sn = input.entrySet();
		Iterator i = sn.iterator();
		while(i.hasNext())
		{
			int n = 0;
			Map.Entry mp = (Map.Entry)i.next();
			n = (int) mp.getValue();
			if(n>50)
			{
				output.put((String) mp.getKey(), "Pass");
			}
			else
			{
				output.put((String) mp.getKey(), "Fail");
			}
		}
		System.out.println(output);
		
	}

}
