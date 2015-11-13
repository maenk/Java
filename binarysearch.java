import java.util.*;
class binary
{static int a[];
	public static void main(String args[])throws NegativeArraySizeException
	{
		int i,j,mid,beg=0,key,n=0;
		Scanner sc= new Scanner(System.in);
		try
			{	
				System.out.println("enter the size of array");
				n=sc.nextInt();
				a= new int[n];
					
}
		catch(NegativeArraySizeException e)
			{
				if(n<0)
					System.out.println("negative cannot be entered enter again");
				n=sc.nextInt();
			a= new int[n];
	}
		
		int end= n-1;
	
		System.out.println("enter the element u want to search");
		key= sc.nextInt();
		System.out.println("enter the array");
		for (i=0;i<n;i++)
	    {
				a[i]=sc.nextInt();

	    }
		while(beg<end)
			{
				mid=(beg+end)/2;
				if (a[mid]==key)
					{ 
						System.out.println("element found  " +key+" at position  "+mid);
					}
				if(key<mid)
					end=mid-1;
				else 
					beg=mid+1;
			}
		
	}
}
