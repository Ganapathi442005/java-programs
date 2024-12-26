
import java.util.Arrays;

public class main 
{
   public static void a()//checking 2 arrays are equal
    {
      int[] nums={1,2,3,3,4};
      int[] nums1={1,2,3,3,4};
     boolean r= Arrays.equals(nums,nums1);
     if(r)
     {
         System.out.println("equal");
     }
     else
     {
        System.out.println("not equal");
     }
      
    }
    
     public static void b()//array sorting
    {
        int[] n1={156,666,434,222};
        Arrays.sort(n1);
        for(int n:n1)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }
    
    
    
    
public static void c()//array addition and average
{
int nums[]={54,21,66,55};
int sum=0;
for(int i=0;i<nums.length;i++)
{
sum=sum+nums[i];
}
System.out.println(sum);
System.out.println(sum/nums.length);
}




    public static void main(String[] args)
    {
        a();
        b();
        c();
    }
}
