import java.util.*;
class Main {


// direct recursion
    public static void direct_recursion(int n)
    {
      if(n==0) return;
      System.out.println(n);
      direct_recursion(n-1);
    }


//indirect recursion
    public static void indirect_recursionA(int k)
    {
     if(k<0) return;
     System.out.println(k);
     indirect_recursionB(k-2);
    }
    public static void indirect_recursionB(int k)
    {
    if(k<0) return;
     System.out.println(k);
     indirect_recursionC(k-2);
    }
    public static void indirect_recursionC(int k)
    {
     if(k<0) return;
     System.out.println(k);
     indirect_recursionA(k-6);
    }

    
//non-tail recursion
    public static int factorial(int g)
    {
        if(g==1) return 1;
        return g*factorial(g-1);
    }
    public static int sum_of_digit(int g)
    {
        if(g==1) return 1;
        return g+sum_of_digit(g-1);
    }
    public static int square(int p,int o)
    {
        if(o==0) return 1;
        return p*(square(p,o-1));
    }
    public static int sum(int l,int n)
    {
        if(l==0) return n;
        return sum(l/10,n+1);

    }

    


    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter number for direct recursion: ");
            int a=sc.nextInt();
            direct_recursion(a);



            System.out.println("enter number for indirect recursion : ");
            int b=sc.nextInt();
            indirect_recursionA(b);


            
            System.out.println("factorial: ");
            int c=sc.nextInt();
            System.out.println(factorial(c));
            System.out.println(" sum of numbers: ");
            int d=sc.nextInt();
            System.out.println(sum_of_digit(d));
            System.out.println("power of a and b numbers: ");
            int e=sc.nextInt();
            int f=sc.nextInt();
            System.out.println(square(e,f));
            System.out.println("number of digit: ");
            int number=sc.nextInt();
            int sum=0;
            System.out.println(sum(number,sum));
        }
}
