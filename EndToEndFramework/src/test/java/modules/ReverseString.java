package modules;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String name="charan";
		
		// i have to reverse
		// narahc //  
		// n  a  r  a h c
		
		String reverse="";
		

		
		for(int i=name.length()-1;i>=0;i--)
		{
			
			
			
			  reverse= reverse+name.charAt(i);
			
		}
		
		System.out.println(reverse);

	}

}
