import java.util.ArrayList;

public class Uncommonelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input_1 = {1,2,3,4};
		int[] input_2 = {1,2,3,5};
		ArrayList<Integer> fin = new ArrayList<Integer>();
		
		fin.addAll(findelement(input_1,input_2));
		fin.addAll(findelement(input_2,input_1));
		System.out.println(fin);
	}
	
	public static  ArrayList<Integer> findelement(int [] in1,int[] in2)
	{
		int flag =0;
		//System.out.println();
		ArrayList<Integer> op = new ArrayList<Integer>();
		for(int i=0;i<in1.length;i++)
		{
			//System.out.println(in1[i]);
			for(int j=0; j< in2.length; j++)
			{
				//System.out.println(in2[j]);
				if(in1[i] == in2[j])
				{
					flag =0;
					break;
				}
				else
				{
					flag = 1;
				}
			}
			if (flag ==1)
			{
				op.add(in1[i]);
			}
			flag =0;
		}
		System.out.println(op);
		return op;
		
	}

}
