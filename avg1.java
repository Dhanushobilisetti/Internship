import java.util.*;

class Average 
{
    public static void replace(int[] arr) 
    {
        int n = arr.length;
        double sum = 0;
        for (int i = 0; i < n; i++) 
	{
            sum += arr[i];
            arr[i] = (int) Math.round(sum / (i + 1));
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,10,12,16};
        replace(arr);
        System.out.println(Arrays.toString(arr));
    }
}


