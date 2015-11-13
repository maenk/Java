/*write a java program to implement stacks using arrays packages...*/
package stack;
class stacks 
{
   int top=1;
  int a[]= new int[10];
  
  public void push(int val)
  {   
    top=top++;
    a[top]=val;
  }
  public void pop()
{System.out.println(a[top]);
  top--;
}
}

class demo extends stacks
{x
public static void main(String args[]) 
{stacks d= new stacks();
 d.push(24);
 d.push(14);
d.push(76);
 d.pop();
  d.pop();
  d.push(34);

}
}
