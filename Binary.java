
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in sorted array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the target value");
        int tar=sc.nextInt();
        int r[]=is2Sum(a,n,tar);
        System.out.println("The pair indices are");
        for(int i=0;i<r.length;i++)
        System.out.print(r[i]+" ");
    }
    public static int[] is2Sum(int a[],int n,int tar)
    {
        for(int i=0;i<n;i++)
        {
            int r=binarySearch(tar-a[i],a,i+1,n-1);
            if(r!=-1)
            return new int[]{i,r};
        }
        return new int[]{-1,-1};
    }
    public static int binarySearch(int x,int a[],int l,int h)
    {
        while(l<h)
        {
            int m=(l+h)/2;
            if(a[m]==x)
            return m;
            else if(a[m]<x)
            l=m+1;
            else
            h=m-1;
        }
        return -1;
}
}
