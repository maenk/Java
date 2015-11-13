import java.util.*;
import java.io.*;
class vehicle
{
  String vname;
  String vtype;
  String colour;
  engine e1=new engine();
  wheel w1= new wheel();
  transmission_system t1= new transmission_system(); 
  vehicle()
  {
    vname="Not Defined";
    vtype="Not Defined";
    colour="Not Defined";
  }
 
 class engine
{
 String etype;
 String efuel;
 double erpm;
 String ecoolent;
 boolean estate;
void einput()
{ 
 System.out.println(""); 
 System.out.println("Input Engine's Details ");
 Scanner sc= new Scanner(System.in);
 
 System.out.print("enter engine type 2stroke or 4Stroke? : ");
  etype= sc.next();
  System.out.print("enter engine fuel petrol or diesel? : ");
  efuel= sc.next(); 
  System.out.print("enter engine rpm : ");
 erpm= sc.nextDouble(); 
System.out.print("enter engine coolent : "); 
ecoolent= sc.next();
System.out.print("enter state of engine true for on or false for off  : ");
 estate= sc.nextBoolean();
 System.out.println("");
 
 }
void eoutput()
{
System.out.println(""); 

  System.out.println("engine type is  : "+etype);
   System.out.println("engine fuel is  : "+efuel);
System.out.println("engine rpm is  : "+erpm);
System.out.println("the work of engine coolent is  : "+ecoolent);
System.out.println("engine on true: engine off false : "+estate);
System.out.println(""); 

}
}
  
class wheel
{
 String wtype;
 int wtyre;
 double wpressure;
 double wrpm;
void winput()
{ 
 System.out.println(""); 
 System.out.println("Input wheel's Details ");
 Scanner sc= new Scanner(System.in);
 
 System.out.print("enter wheel type : ");
  wtype= sc.next();
  System.out.print("no of wheels? : ");
 wtyre= sc.nextInt(); 
  System.out.print("enter wheel pressure : ");
wpressure= sc.nextDouble(); 
System.out.print("enter rpm : "); 
wrpm= sc.nextDouble();

 System.out.println("");
 
 }
void woutput()
{
System.out.println(""); 

  System.out.println("wheel type is  : "+wtype);
   System.out.println("wheeler    : "+wtyre);
System.out.println("wheel pressure is  : "+wpressure);
System.out.println("wheel rpm is  : "+wrpm);

System.out.println(""); 

}
}
 
class transmission_system
{
String ttype;
int tstate;
int tmax_rpm[]=new int[4];
void rpmmaker()
{ 
        tmax_rpm[0]= 1000;
	tmax_rpm[1]= 5000;
	tmax_rpm[2]= 8000;
	tmax_rpm[3]= 10000;
      
}


void tinput()
{ 
 System.out.println(""); 
 System.out.println("Input transmission system's Details ");
 Scanner sc= new Scanner(System.in);
 
 System.out.print("enter transmission system type : ");
  ttype= sc.next();
  System.out.print("enter transmisson state : ");
  tstate= sc.nextInt(); 
 rpmmaker();
 System.out.println("");
 }
void toutput()
{
System.out.println(""); 

  System.out.println("transmiision  type is  : "+ttype);
   System.out.println("transmission state is   : "+tstate);
System.out.println(" maximum rpm : "+ tmax_rpm[tstate-1]);

System.out.println(""); 

}
 }
void vinput()
{ 
 
  Scanner sc= new Scanner(System.in);
  System.out.print("enter the vehicle type : ");
  vtype= sc.next();
  System.out.print("enter the vehicle name : ");
  vname= sc.next();
  System.out.print("enter the vehicle colour : ");
  colour= sc.next();
 e1.einput();
 w1.winput();
 t1.tinput();
  
}
void voutput()
{
  System.out.println("type : "+vtype);
   System.out.println("name : "+vname);
  System.out.println("colour : "+colour);
e1.eoutput();
 w1.woutput();
 t1.toutput();
 


 }
}

class demo
{
 public static void main(String args[])  
 { 

   vehicle v= new vehicle();
  v.vinput();
  v.voutput();
  
  
  
    
}
 
}



   
  
