import java.util.*;
class selection1
{
	public static void main(String args[])
	{
		int i,j,small,pos;
		int a[]= new int[4];
		Scanner sc= new Scanner(System.in);
	
		for (i=0;i<4;i++)
	    {
				a[i]=sc.nextInt();
	    }
		
		System.out.println("the array in unsorted form  is");
		
		for(i=0;i<4;i++)  
	    {
		    System.out.print("  "+a[i]);
	    }
		System.out.print("\n");

		
				for(i=0;i<4;i++)
					{ 
						
						for (j=i+1;j<=4;j++)  
							{
								if (a[j]> a[j+1]) 
									{
										small=a[j+1];pos=j+1;
													
		System.out.println("jloop  "+small+"  jloop  "+pos);
							int	temp=a[pos];
								a[pos]=a[i];
								a[i]=temp;	}		

							}
					}	
		System.out.println("the array in sorted form  is");
		
		for(i=0;i<4;i++)  
	    {
				System.out.print("  "+a[i]);
	    }        
		System.out.print("\n");
	}    
}

