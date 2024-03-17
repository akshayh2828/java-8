package array;

class EvenOdd {
	
	public static void main(String[] args) {
		int arr[]= {2,8,7,9,5,4,3,11,14};
		int sumeven=0;
		int sumodd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sumeven=sumeven+arr[i];
				System.out.println("even number="+arr[i]);
			}
			else {
				sumodd=sumodd+arr[i];
				System.out.println("sum of odd="+arr[i]);
			}
				
		}
		System.out.println(sumeven);
		System.out.println(sumodd);

	}

}
