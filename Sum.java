
public class Sum {
		 
		static int Square_Diff(int n){
		 
		int l, k, m;
		    // Sum of the squares of the
		    // first n natural numbers is
		    l = (n * (n + 1) * (2 * n + 1)) / 6;
		     
		    // Sum of n naturals numbers
		    k = (n * (n + 1)) / 2;
		 
		    // Square of k
		    k = k * k;
		     
		    // Differences between l and k
		    m = Math.abs(l - k);
		     
		    return m;
		 
		}
		 
		// Driver Code
		public static void main(String s[])
		{
		    int n = 10;
		    System.out.println(Square_Diff(n));    
		}
	}

