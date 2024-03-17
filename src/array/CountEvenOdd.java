package array;

public class CountEvenOdd {
	public static void main(String[] args) {
		int [] arr= {1,3,4,2,8,7,9,54,9};
		int count=0;
		int oddcount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
			else
			{
				oddcount++;
			}
			
		}
		System.out.println(count);
		System.out.println(oddcount);


	}

}
