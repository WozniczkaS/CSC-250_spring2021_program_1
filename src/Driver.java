
public class Driver 
{
	public static void main(String[] args)
	{ 
		System.out.println("hello world");
		countVowel("Matthew");
	}
	static String countVowel(String s)
	{
		int answer = 0;
		for(int d = s.length()-1; d >= 0; d--)
		{
			if (s.charAt(d) == 'a' )
			{
				answer = answer + 1;
			}
			if (s.charAt(d) == 'A')
			{
				answer = answer + 1;
			}
			if (s.charAt(d) == 'e')
			{
				answer = answer + 1;
			}
			if (s.charAt(d) == 'E')
			{
				answer = answer + 1;
			}
			if (s.charAt(d) == 'i')
			{
				answer = answer + 1;
			}
			if (s.charAt(d) == 'I')
			{
				answer = answer + 1;
			}
			if (s.charAt(d) == 'o')
			{
				answer = answer + 1;
			}
			if (s.charAt(d) == 'O')
			{
				answer = answer + 1;
			}
			if (s.charAt(d) == 'u')
			{
				answer = answer + 1;
			}
			if (s.charAt(d) == 'U')
			{
				answer = answer + 1;
			}
		}
		System.out.print(answer);
		return s;
	}
}
