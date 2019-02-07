
import java.util.Scanner;

class MD47
{
	public static void main(String args[])
	{
		String input="11100100110111010011100100101001";

		while(input.length()%8!=0)
		{
			input=input+"0";
		}

		String output=""+input;
		int sum,i,j;

		for(j=0;j<8;j++)
		{	
			sum=0;
			for(i=0;i<input.length();i++)
			{
				if(i%8==j)
				{
					sum=sum+(int)input.charAt(i);

					
				}
			}
			if(sum%2==0)
			output=output+"0";
			else
			output=output+"1";
		}

		System.out.println(output);
		
	} 
}
