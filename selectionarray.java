import java.util.*;
class selection
{
	static int i,j,temp,small,pos;
	static int a[]= new int[4];
	static	void bubble()
	{	
		for(i=0;i<4;i++)
	    {
				for (j=0;j<4-i-1;j++)  
					{
						if (a[j]> a[j+1]) 
							{
								temp=a[j];
								a[j]=a[j+1];
								a[j+1]=temp;
							}
						
					}
	    }	
	}

	static	void selection()
	{
  	for(i=0;i<4;i++)
			{
				small=a[i]; pos=i;
				for (j=i+1;j<4;j++)  
					{
						if (small> a[j]) 
							{
										small=a[j];pos=j;
							}
					}
				a[pos]=a[i];
				a[i]=small;
			}							
				
	}
	static	void input()
		{
			Scanner sc= new Scanner(System.in);
	
		for (i=0;i<4;i++)
	    {
				a[i]=sc.nextInt();
	    }
		}

	static	void display()
		{
	
		System.out.println("the array is");
		for(i=0;i<4;i++)  
	    {
		    System.out.print("  "+a[i]);
	    }
		System.out.print("\n");
		}

	public static void main(String args[])
	{
		
		
	  int op;
    selection s= new selection();
 do
		{
			System.out.println("enter the op u want to perform 1: input\n 2: bubble sort\n 3:selection sort \n 4: display\n 5:exit\n");
		 Scanner sc = new Scanner(System.in);
		 op = sc.nextInt();
	switch(op)
				{
				case 1: s.input();
					break;
				case 2: s.bubble();
					break;
				case 3: s.selection();
					break;
				case 4: s.display();
					break;
				case 5: break;
				}
		} while(op!=5);
	}
}
