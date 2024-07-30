package modules;

import java.util.HashMap;

public class CharacterOccurenceTimes {

	public static void main(String[] args) {
		
		
		String name="charan";
		
		// 211 ; 99
		// 260 ; 80
		
		// c has repeated 1 time  // a reaperd 2 times
		
		
		//character    Integer
		// key           value
		
		// c              1
		// h              1
		// a             1
		//r               1
		
		
		
		
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(int i=0;i<name.length();i++)
		{
			
			if(hm.containsKey(name.charAt(i)))
			{
				
				int value=   hm.get(name.charAt(i));
				
				hm.put(name.charAt(i), value+1);
				
			}
			else
			{
				
				hm.put(name.charAt(i), 1);
			}

		}
		
		System.out.println(hm);
		
		
		

	}

}
