import java.util.*;

class TwoSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, target;
        System.out.println("Enter n value: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter target: ");
        target = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] result = findTwoSumPair(a, n, target);

        System.out.println("Pair: " + result[0] + ", " + result[1]);
    }

    static int[] findTwoSumPair(int[] a, int n, int target) 
    {
        Arrays.sort(a); 
        for (int i = 0; i < n - 1; i++) 
	{
            int s = target - a[i];
            int index = binarySearch(a, i + 1, n - 1, complement); 
            if (index != -1) {
                return new int[]{a[i], a[index]};
            }
        }
        return new int[]{-1, -1}; 
    }

    static int binarySearch(int[] a, int low, int high, int target) 
    {
        while (low <= high) 
	{
            int mid = low + (high - low) / 2;
            if (a[mid] == target) 
	    {
                return mid; 
            } 
	   else if (a[mid] < target) 
	   {
                low = mid + 1; 
            } 
	    else 
	    {
                high = mid - 1; 
            }
        }
        return -1; 
    }
}
