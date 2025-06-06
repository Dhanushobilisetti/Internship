import java.util.*;

class TwoSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, a[], target;
	System.out.println("Enter n value: ");
        n = sc.nextInt();
        a = new int[n];
	System.out.println("Enter target: ");
        target = sc.nextInt();
	System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if (isTwoSum(a, n, target)) {
            System.out.println("Present");
        } else {
            System.out.println("NotPresent");
        }
    }

    static boolean isTwoSum(int a[], int n, int t) 
    {
        Arrays.sort(a);
        for (int i = 0; i < n; i++) 
	{
            int s = t - a[i];
            if (binarySearch(a, i + 1, n - 1, s)) 
	    {
                return true;
            }
        }
        return false;
    }

    static boolean binarySearch(int a[], int left, int right, int target) 
    {
        while (left <= right) {
            int mid = left + (right - left) / 2;
	    if (a[mid] == target) 
	    {
                return true; 
            } 
	    else if (a[mid] < target) 
	    {
                left = mid + 1; 
            } 
	    else 
	    {
                right = mid - 1; 
            }
        }
        return false; 
    }
}
