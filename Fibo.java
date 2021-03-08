class X
{
	static int fibo(int x)
	{
		int c,i,a=0,b=1;
		for(i=0;i<x;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		return b;
	}
}
class Fibo
{
	public static void main(String args[])
	{
		System.out.println("Fibonacci series of given number: "+X.fibo(Integer.parseInt(args[0])));
	}
}