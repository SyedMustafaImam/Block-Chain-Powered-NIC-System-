package dsa_project_nadra.powered.by.blockchain_;

import java.util.NoSuchElementException;

public class stack_array {
    String arr[];
    int top,size,len;
    public stack_array(int n)
    {
    size =n;
    len=0;
    arr=new String [size];
    top=-1;
    }
    public boolean isEmpty()
    {
    return top==-1;
    }
    public boolean isFull()
    {
    return top==size;
    }
public int getSize()
{
    return len;
}

public void push (String i)
{
if(isFull())

throw new IndexOutOfBoundsException("Overflow Exception");
arr[++top]=i;
len++;

}
public String pop()
        
{
if(isEmpty())
    throw new NoSuchElementException("Underflow");
len--;

        return arr[top--];
}
public void display()
{
    System.out.println("\nStack = ");

if (len==0)

{
    System.out.println("Empty\n");
    return ;
}
for (int i =top;i>=0;i--){
    System.out.println(arr[i]+" ");
    System.out.println();
}
}
}
