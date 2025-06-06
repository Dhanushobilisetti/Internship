import java.util.*;

class TwoSum {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n, a[], target;
	System.out.println("Enter n value: ");
        n = sc.nextInt(); 
        a = new int[n];  
	System.out.println("Enter target: ");
        target = sc.nextInt(); 
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt(); 
        }
	 if (isTwoSum(a, n, target)) 
	{
            System.out.println("Present");
	    return int a[]{a[i],a[j]};
        } 
	else 
	{
            System.out.println("NotPresent");
	    return int a[]{-1,-1};
        }

    }

    static boolean isTwoSum(int a[], int n, int t) 
    {
	Arrays.sort(a);
	int i=0;
	int j=n-1;
	while(i<j)
	{
		int s=a[i]+a[j];
                if (t==s) 
		{
                    return true;
                }
		else if(t<s)
		{
			i++;
		}  
		else
		{
			j--;	
		}   
        }
        return false;
    }
}
