import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Deleteduplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		String input =sn.nextLine();
		StringBuilder sb = new StringBuilder();
		
		char [] ch = input.toCharArray();
		Set<Character> char_set = new LinkedHashSet<Character>();
		for(char c:ch)
		{
			char_set.add(c);
			//sb.append(char_set);			
		}
		
		Iterator<Character> i =char_set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		for(Character ch_c:char_set)
		{
			sb.append(ch_c);
		}
		
		System.out.println("Final Op = " + sb.toString());
		
		//System.out.println("Input "+ input);

	}

}
