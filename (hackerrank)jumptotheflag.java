package jumptotheflag;

public class Jump {
	
	int minjump=0;
	
	public  int Jumpbob(int k, int j)
	{
		 minjump = k/j;
		minjump= minjump+k%j;
		
		
		return minjump;
	}

	
	public static void main(String[] args)
	{
		
		Jump j = new Jump();
		System.out.print(j.Jumpbob(3,1));
	}
}
