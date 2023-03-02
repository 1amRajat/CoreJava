
public class Vowelcheck {
	
	public void vowCheck(String input)
	{
	
		if(input.contains("a") && input.contains("e") && input.contains("i") && 
				input.contains("o") && input.contains("u"))
		{
			System.out.println("All vowels present");
		}
		else
		{
			System.out.println("Not valid");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowelcheck vw = new Vowelcheck();
		vw.vowCheck("abemikou");
		vw.vowCheck("bemikou");

	}

}
