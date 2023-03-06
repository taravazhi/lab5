import java.io.*;
import java.util.Scanner;
Class A
{
    int i,j;
    A( int a,int b);
    {
        i=a;
        j=b;
    
    }
    void display()
{
    System.out.println("i="+i);
    System.out.println("j="+j);

}
Class B extends a
{
    int k
    B( int a, int b,int c)
    {
        i=a;
        j=b;
        k=c;
    }
    void sum()
    {
        int s= i+j+k;
        System.out.println("sum="+s);
    }
    void display()
    {
        System.out.println("sum="+s);
        System.out.println("k="+k);
    }
    Class sample
    {
        Public static void main(String args[])
        {
            B.obj=new (10,20,30);
            obj.display();
            obj.sum();
        }
        }
    }
    }
