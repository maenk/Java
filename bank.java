/*create a class bank which will maintain a list of customer . max customer is 10. customer will have a name , account number and balance . bank class will provide the following functionality
1:
Add_customer().. it will create a customer and add it in array if array is not full .. otherwise it will raise an maxcustomer exception..
2: 
Delete_customer(). if will remove the customer from array .. it will first search for customer account_n0. if found remove it from array.. otherwise raise customernotfoundexception..
3:
 withdraw().. search the customer accountno.. if found check whether amount< balance if not raise insufficientFundException.
4:
deposit()
search for customer if found check amount>0, otherwise raise invaliddepositException..
5:
transfer()
search for both the customer .. if transfer amount > balance.. otherwise raise properException
*/
import java.util.*;
class customer
{
 static String name;
 static double account_number;
 static double balance;
  customer(String n,double ac_num,double bal)
   {
     name=n;
     account_number=ac_num;
     balance= bal;
    }
}
class bank
{
 
	static int count=0;
	static String n;
	static double ac_num,bal;
	
   
  static customer c[]=new customer[10];
static void Add_customer() throws MaxCustomerException
   { if (count<10)  	
	{
 	Scanner sc= new Scanner(System.in);
	System.out.println("enter the name of the customer");
        n= sc.nextLine();
	ac_num= sc.nextDouble();
	bal=sc.nextDouble();
        c[count++]=new customer(n,ac_num,bal);
	}
 	else
 	 throw new MaxCustomerException();  

}
static void delete_customer() throws CustomerNotFoundException  
   { int i=0,flag=0;
     System.out.println("enter the accnt num of d customer u want to delete");
     Scanner sc= new Scanner(System.in);
     ac_num=sc.nextDouble();
     for(i=0;i<10;i++)
  	{
	 if (ac_num == c[i].account_num)
	  {
           c[i]= NULL;
	   flag=1;	 
	  }
        }
      if (flag = 0)
      {
      throw CustomerNotFoundException();  
      }
   }
static void withdraw() throws InsufficientFundException
  {
   int i=0,flag=0; double amount;
     System.out.println("enter your accnt num");
     Scanner sc= new Scanner(System.in);
     ac_num=sc.nextDouble();
   System.out.println("enter the ammont");
   amount=sc.nextDouble();
   
     for(i=0;i<10;i++)
  	{
	 if (ac_num == c[i].account_num)
	   flag=1;
	}
          if (flag==1)	 
	   {
	     if (c[i].bal>amount)
            System.out.println(" can be withdrawn");
	   else 
	   throw InsufficientFundException();  
      }
  }
    
static void Deposit() throws InvalidDepositException
{
  int i=0,flag=0; double amount;
     System.out.println("enter your accnt num");
     Scanner sc= new Scanner(System.in);
     ac_num=sc.nextDouble();
   System.out.println("enter the ammont u want to deposit");
   amount=sc.nextDouble();
   
     for(i=0;i<10;i++)
  	{
	 if (ac_num == c[i].account_num)
	   flag=1;
	}
          if (flag==1)	 
	   {
	     if (c[i].bal>amount)
            System.out.println(" can be withdrawn");
	   else 
	   throw InsufficientFundException();  
      }
  }
  public static void main(String args[])
	{
		try {
		Add_customer();
		} catch (MaxCustomerException e) { 
		 System.out.println("Caught " + e);
		}
}
		
}
 
class MaxCustomerException extends Exception
 {
   
   public String toString()
    {
     return "array is full";
     }
  }   
class CustomerNotFoundException extends Exception
 {
   public String toString()
    {
     return "customer not found";
     }
  }   
class InsufficientFundException extends Exception
 {
   public String toString()
    {
     return "insufficient funds";
     }
  }   
class InvalidDepositException extends Exception
 {
   public String toString()
    {
     return " amount not deposited";
     }
  }   
class ProperException extends Exception
 {
   public String toString()
    {
     return "transfer amount less than balance";
     }
  }   

   
