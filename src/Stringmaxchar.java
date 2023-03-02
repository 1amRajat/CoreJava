import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Stringmaxchar {
	
	public void maxChar(String input)
	{
		int count = 0;
		HashMap<String,Integer> hs = new HashMap<String,Integer>();
		String input_1 = input.replace(" ","");
		char[] ch =input.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			StringBuilder sb = new StringBuilder();
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] & ch[i]!= ' ')
				{
					count++;
					ch[j] = ' ';
				}
			}
			if(count > 0) {
				hs.put(sb.append(ch[i]).toString(),count);
			}
			count = 0;
		}
		Set st = hs.entrySet();
		Iterator it = st.iterator();
		while(it.hasNext())
		{
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println("Key :" + pair.getKey() + " Value :" + pair.getValue());			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringmaxchar sc = new Stringmaxchar();
		sc.maxChar("thhiss iss innddiiaaa");

	}

}
