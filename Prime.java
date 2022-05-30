import java.io.*;
public class Prime {

	public static void main(String[] args)throws IOException
	{
		System.out.println("Enter a number");

		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		int n = Integer.parseInt(br.readLine()); // to read the number
		int a = 0; // to count the factors
		int i = 0; // to move from 1 to n
		int x = 0; // to shift to the next number 

		System.out.println ("The prime numbers are");

		for (i=1; i<=n; i++)
		{
		a=0;
		for (x=1; x<=i; x++)
		{
		if (i%x == 0)
		a++;
		}
		if (a==2)
		System.out.println (i);
		}
		}
}
