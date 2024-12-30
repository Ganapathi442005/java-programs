import java.util.*;
 class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
       
            int a=sc.nextInt();
            int[] arr=new int[a];
            for(int j=0;j<a;j++)
            {
             arr[j]=sc.nextInt(); 
              
            }
            for(int j=arr.length-1;j>=0;j--)
            {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        

    }
}
