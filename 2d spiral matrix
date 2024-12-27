import java.util.*;
class spiral_matrix {
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);  
      int row=sc.nextInt();
      int col=sc.nextInt();
      int [][] arr=new int[row][col];
      for(int i=0;i<arr.length;i++)
      {
        for(int j=0;j<arr.length;j++)
        {
            arr[i][j]=sc.nextInt();
        }
      }
     int top=0;
     int bot=col-1;
     int left=0;
     int right=row-1;
     int d=1;
     while(top<=bot && left<=right)
     {
        if(d==1)
        {
            for(int i=left;i<=right;i++)
            {
                System.out.println(arr[top][i]);

            }
            top++;

        }
        if(d==2)
        {
            for(int i=top;i<=bot;i++)
            {
                System.out.println(arr[i][right]);
            }
            right--;
        }
        if(d==3)
        {
            for(int i=right;i>=left;i--)
            {
                System.out.println(arr[bot][i]);
            }
            bot--;
        }
        if(d==4)
        {
            for(int i=bot;i>=top;i--)
            {
                System.out.println(arr[i][left ]);

            }
            left++;
        }
        d++;
        if(d==5)
        {
            d=1;
        }
     }

    }
    
}
