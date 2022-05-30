
public class Alphabetic {
	static boolean alphabetical_order(String my_str){
	      int str_len = my_str.length();
	      for (int i = 1; i < str_len; i++){
	         if (my_str.charAt(i) < my_str.charAt(i - 1)){
	            return false;
	         }
	      }
	      return true;
	   }

	public static void main(String[] args) {
		String my_str = "abcmnqxz";
	      if (alphabetical_order(my_str)){
	         System.out.println("The letters are in alphabetical order.");
	      } else{
	         System.out.println("The letters are not in alphabetical order.");
	      }
	   }
	}

