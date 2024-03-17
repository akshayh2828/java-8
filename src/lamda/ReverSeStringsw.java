package lamda;

import java.util.Arrays;

public class ReverSeStringsw {
	public static void main(String[] args) {
		String str="akshay";
		String[] str1=str.split("");
	
		int start=0;
		int end=str1.length-1;
		String temp;
		while(start<end)
		{
			temp=str1[start];
			str1[start]=str1[end];
			str1[end]=temp;
			start++;
			end--;
			
		}
		System.out.println(Arrays.toString(str1));
		
	}

}
