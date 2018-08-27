import java.io.*;
class Fib{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t,n,d,j,k;
        int i=0;
        int a[]=new int[20];
        System.out.println("Enter no.of test cases");
        t=Integer.parseInt(br.readLine());
        System.out.println("Enter nth number to find, Enter no.of digits");
        n = Integer.parseInt(br.readLine());
        d = Integer.parseInt(br.readLine());
        System.out.println("Enter first "+d+" digits");
        k=1;
        for(i=0;i<d;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
           // k=k*a[i];
        }
        //a[i]=k;
        int l=i;
        for(i=0;i<n;i++)
        {
            k=1;
            for(j=i;j<d+i;j++)
            {
                k=k*a[j];
           }
    a[l]=k;
    l++;
    }
    for(l=0;l<n;l++)
    System.out.print(a[l]+" ");
}
}