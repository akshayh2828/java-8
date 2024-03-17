package array;

public class LinearSort {
	public static int linearSort(int arr[],int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(x==arr[i])
			{
				return i;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		int ar[]= {1,2,4,8,7,6,15};
		System.out.println(linearSort(ar, 7));
		System.out.println(linearSort(ar, 500));
		
		
		
	}
}
