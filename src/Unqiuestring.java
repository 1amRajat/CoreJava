import java.util.HashSet;
import java.util.Iterator;

public class Unqiuestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aabbccd";
		char [] ch = input.toCharArray();
		HashSet<String> hs = new HashSet<String>();
		
		for(Character c: ch)
		{
			hs.add(c.toString());
		}
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
