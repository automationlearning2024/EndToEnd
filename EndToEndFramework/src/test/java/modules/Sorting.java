package modules;

public class Sorting {

	public static void main(String[] args) {
		
		
		int[] nums= {6,4,9,5,3};
		
		int temp;
		int ki=0;
		
		//ascedning - small to big 
		
		for(int i=0;i<nums.length;i++)
		{
			
			for(int j=i+1;j<nums.length;j++)
			{
				   //   6    >   4
				    if(nums[i]<nums[j])
				    {
				    	
				    	  temp=nums[i];
				    	     nums[i]  =  nums[j];
				    	       nums[j]  = temp;			    	
				    }
				
			}
		
		}
		
		//System.out.println(nums);
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}		
		
		
		

	}

}
