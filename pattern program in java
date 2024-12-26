import java.util.Scanner;
class Main{

public static void z(int size)
{
for(int i=0;i<size;i++)
{
   for(int j=0;j<size;j++)
    {
    System.out.print("*");
    }
System.out.println(); 
}
}

public static void y(int a)
{
for(int i=1;i<=a;i++)
 {
for(int k=a-1;k>=i;k--)
{
System.out.print(" ");
}
 for(int j=1;j<=i;j++)
{
System.out.print("* ");
}

System.out.println();
}
}


public static void x(int a)
{
 for(int i=a;i>=1;i--)
   {
       for(int j=0;j<a-i;j++)
       {
           System.out.print(" ");
       }
       for(int j=a;j>=a-i+1;j--)
       {
           System.out.print("* ");
       }
       System.out.println();
       
   }
}


public static void main(String[] args)
{
System.out.println("1.square pattern");
System.out.println("2.triangle pattern");
System.out.println("3.reverse triangle pattern");
Scanner sc=new Scanner(System.in);
System.out.println("Enter your choice:");
int choice=sc.nextInt();
while(true){
if(choice==1)
{
int size=sc.nextInt();
z(size);
}
else if(choice==2)
{
int a=sc.nextInt();
y(a);
}
else if(choice==3)
{
int a=sc.nextInt();
x(a);
}
else
{
break;
}
}
}
}
