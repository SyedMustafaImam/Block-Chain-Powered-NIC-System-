
package dsa_project_nadra.powered.by.blockchain_;

import java.util.NoSuchElementException;

public class queuu_arr {
        String[] question = {"Name:", "Father Name:", "Gender:", "City:", "District:","Date of Birth:", "Country:", "Date of Issued:","Date of Expiry:", "NIC:"};
 String [] queue;
int front,rear,size,len;
    public queuu_arr(int n){
        
     size =n;
     len =0;
     queue= new String[size];
     front =-1;
     rear=-1;
    }
public boolean isEmpty()
{
return front ==-1;

}
public boolean isFull()

{
return front==0 && rear==size -1;
}
    public int getSize()
   {
    return len;
    }
public void insert(String i){
if(rear==-1)
{
    front=0;
    rear=0;
    queue[rear]=i;
}
else if(rear + 1 >= size)
{
throw new IndexOutOfBoundsException("Overflow Exception");
}
else if(rear+1 < size)
{
queue[++rear]=i;
len++;
        
}

    
}

public String remove()
{

if(isEmpty())
throw new NoSuchElementException("Underflow Exception++");
else{
 len--;
 String ele=queue[front];
 if (front == rear)
 {
 front =-1;
 rear=-1;
        
 }     
     else     
    front++;
    return ele;
    }

}
public void display()
{
    System.out.println("------------------------------------- ID:"+queue[9]+" Block Data -------------------------------------------------- ");
    if(len==0)
    {
        System.out.println("Empty\n");
    return ;
    }
  for(int i=front;i<rear;i=i+2) 
  {
      int j=i+1;
      System.out.println(question[i]+ " "+queue[i]+" " +"\t\t\t\t"+question[j]+ " "+queue[j]);
      System.out.println();
  }

System.out.println("----------------------------------------------------------------------------------------------------------------------- ");
}
}
