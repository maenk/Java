import java.util.*;
class demo
{
	public static void main(String args[])
	{
		int i,j,temp;
		int a[]= new int[10];
		Scanner sc= new Scanner(System.in);
	
		for (i=0;i<10;i++)
	    {
				a[i]=sc.nextInt();
	    }
		
		System.out.println("the array in unsorted form  is");
		
		for(i=0;i<10;i++)  
	    {
		    System.out.print("  "+a[i]);
	    }
		System.out.print("\n");
		
	
		for(i=0;i<10;i++)
	    {
				for (j=0;j<10-i-1;j++)  
					{
						if (a[j]> a[j+1]) 
							{
								temp=a[j];
								a[j]=a[j+1];
								a[j+1]=temp;
							}
						
					}
	    }	
		System.out.println("the array in sorted form  is");
		
		for(i=0;i<10;i++)  
	    {
				System.out.print("  "+a[i]);
	    }        
		System.out.print("\n");
	}    
}
