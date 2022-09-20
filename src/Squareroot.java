

public class Squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Squareroot rt = new Squareroot();
		//rt.sqroot(5, 10, 15, 20);
		System.out.println(rt.sqroot(5, 10, 15, 20));

	}
	
	public int sqroot(int x1, int x2, int y1, int y2)
	{
		int res;
		res = (int) Math.sqrt(((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2)));
		return res;
	}

}
