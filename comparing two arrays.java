 class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int[] arr=new int[a];
            int[] arr1=new int[b];
            for(int j=0;j<a;j++)
            {
             arr[j]=sc.nextInt(); 
              
            }
              for(int j=0;j<b;j++)
            {
             arr1[j]=sc.nextInt(); 
              
            }
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<b;j++)
                {
                    if(arr[i]==arr1[j])
                    {
                        System.out.print(arr[i]+" ");
                        arr1[j]=0;
                    }
                }
            }
        

    }
}
