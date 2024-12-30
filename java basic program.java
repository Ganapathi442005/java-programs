import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner pg=new Scanner(System.in);
        int a=pg.nextInt();
        int b=pg.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Quit");
        System.out.println("Enter your choice");
       
       while(true){
            int choice=pg.nextInt();
        if(choice==1)
        {
            System.out.println("adding:"+(a+b));
        }
         else if(choice==2)
        {
            System.out.println("subtracting:"+(a-b));
        }
         else if(choice==3)
        {
            System.out.println("multiplying:"+(a*b));
        }
         else if(choice==4)
        {
            System.out.println("dividing:"+(a/b));
        }
        else
        {
            break;
        }
       }
    }
}
