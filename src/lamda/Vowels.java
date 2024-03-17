package lamda;

public class Vowels {
	public static void main(String[] args) {
		String str="nikhil santosh akshay dhiraj";
		String[] str1=str.split("\\s+");
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i].matches("[aeiou].*"))
			{
				
				System.out.println(str1[i]);

			}

		}
		
		
		
	}

}
