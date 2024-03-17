package array;

public class Replacement {
	public static void main(String[] args) {
		int arr[]= {2,5,4,0,4,0,6,0,6,0};
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				System.out.println(2);
			}
			index=arr[i];
		}
		System.out.println(arr);
		System.out.println();
	}

}
