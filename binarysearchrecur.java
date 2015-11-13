import java.util.*;
class binaryrecur
{
	static int arr[];
	
static int binarySearch(int arr[], int beg, int end, int key)
	{		while(beg<end)
			{
				int mid = (beg+end)/2;
				if (arr[mid] == key)  return mid;
				if (arr[mid] > key) return binarySearch(arr, beg, mid-1, key);
				return binarySearch(arr, mid+1, end, key);
			}
		return -1;	
}
	
	public static void main(String args[])
	{
		int i;
		int arr[] =new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the key yu want to search");
		int  key=sc.nextInt()	;
		System.out.println("enter array");	
	 	for (i=0;i<5;i++)
	    {
				arr[i]=sc.nextInt();
				
	    }
		
		int result = binarySearch(arr, 0, 5-1, key);
		if(result!=-1)
			System.out.println("Element is present at index "+ result);
	  else
	System.out.println("Element not found in array");
	}
}
